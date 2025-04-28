package lista4;

import java.util.Scanner;

public class MaquinaDeLavar {
    public int lavar (Roupa[] roupas) {
        int verificarRoupas = 0;
        int tempoDeLavagem = 0;
        for (Roupa i : roupas) {
            if (i.getCor() == Cor.BRANCO) {
                verificarRoupas++;
            } else if (i.getCor() == Cor.COLORIDO) {
                for(Roupa x : roupas) {
                    if (x.getCor() == Cor.BRANCO) {
                        verificarRoupas--;
                    }
                    else {
                        verificarRoupas++;
                    }
                }
            }
            if (i.getTamanho() == Tamanho.P) {
                tempoDeLavagem += 3;
            }
            else if (i.getTamanho() == Tamanho.M) {
                tempoDeLavagem += 5;
            }
            else if (i.getTamanho() == Tamanho.G) {
                tempoDeLavagem += 8;
            }
            if (i.getCor() == Cor.BRANCO) {
                tempoDeLavagem++;
            } else if (i.getCor() == Cor.COLORIDO) {
                tempoDeLavagem+=2;
            }
            if (i.getEstado() == Estado.SUJA) {
                tempoDeLavagem += 3;
                i.setEstado(Estado.LIMPA);
            }
        }
        if (verificarRoupas < roupas.length) {
            return -1;
        }
        System.out.println("A quantidade de minutos necessario para a lavagem é de: ");
        return (tempoDeLavagem);
    }

    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.println("Digite a quantidade de roupas a serem lavadas");
        int quantidade = (print.nextInt());
        print.nextLine();
        Roupa[] roupas = new Roupa[quantidade];
        for (int i = 0; i < roupas.length; i++) {
            System.out.print("Digite a cor da roupa (Branco ou colorido): ");
            String entradaCor = print.nextLine().toUpperCase();
            Cor cor = Cor.valueOf(entradaCor);
            System.out.print("Digite o tamanho (P, M, G): ");
            String entradaTamanho = print.nextLine().toUpperCase();
            Tamanho tamanho = Tamanho.valueOf(entradaTamanho);
            System.out.print("Digite o estado da roupa (Limpa ou Suja: ");
            String entradaEstado = print.nextLine().toUpperCase();
            Estado estado = Estado.valueOf(entradaEstado);
            roupas[i] = new Roupa(cor,tamanho,estado);
        }
        MaquinaDeLavar m = new MaquinaDeLavar();
        System.out.println(m.lavar(roupas));
        if (m.lavar(roupas) == -1){
            System.out.println("Não é possivel realizar a lavagem, roupas brancas e coloridas misturadas");
        }
        else {
        for (Roupa x : roupas ) {
            System.out.println(x.getEstado());
        }
        }
    }
}
