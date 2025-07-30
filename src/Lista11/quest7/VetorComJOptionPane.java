package Lista11.quest7;
import javax.swing.JOptionPane;

public class VetorComJOptionPane {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        boolean preenchido = false;

        while (!preenchido) {
            try {
                String posStr = JOptionPane.showInputDialog("Informe a posição (0 a 9):");
                int pos = Integer.parseInt(posStr);

                String valorStr = JOptionPane.showInputDialog("Informe o valor inteiro para a posição " + pos + ":");
                int valor = Integer.parseInt(valorStr);

                vetor[pos] = valor;

            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Erro: Posição inválida! Use de 0 a 9.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Você deve informar apenas números inteiros.");
            }

            preenchido = true;
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == 0) {
                    preenchido = false;
                    break;
                }
            }
        }

        // Calcula a soma
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }

        JOptionPane.showMessageDialog(null, "Todas as posições foram preenchidas!\nSoma dos valores: " + soma);
    }
}