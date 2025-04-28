package lista4;

public class MaquinaDeLavar {
    public int lavar (Roupa[] roupas) {
        int verificarRoupas = 0;
        int tempoDeLavagem = 0;
        for (Roupa i : roupas) {
            if (i.getCor() == Cor.BRANCO) {
                verificarRoupas++;
            } else if (i.getCor() == Cor.COLORIDO) {
                verificarRoupas--;
            }
            if (verificarRoupas < roupas.length + 1) {
                return -1;
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
        return tempoDeLavagem;
    }

    public static void main(String[] args) {

    }
}
