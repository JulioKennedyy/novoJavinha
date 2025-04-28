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
                verificarRoupas--;
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
        return tempoDeLavagem;
    }

    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        Roupa r = new Roupa(Cor.BRANCO,Tamanho.M,Estado.LIMPA);
        Roupa b = new Roupa(Cor.COLORIDO,Tamanho.P,Estado.LIMPA);
        Roupa lavagem[] = {r,b};
        MaquinaDeLavar m = new MaquinaDeLavar();
        System.out.println(m.lavar(lavagem));
    }
}
