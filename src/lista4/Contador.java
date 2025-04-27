package lista4;

import java.util.Scanner;

public class Contador {
    public float calcularImpostoDeRenda(Trabalhador trabalhador) {
        float salarioNovo = (float) (trabalhador.getSalarioBruto() - (189.59 * trabalhador.getDependentes()));
        if (salarioNovo < 1903.98) {
            float valor = (float) salarioNovo;
            return valor;
        }
        else if (salarioNovo < 2826.6) {;
            return (float) (salarioNovo - 142.80);
        }
        else if (salarioNovo < 3751.05) {
            return (float) (salarioNovo - 354.80);
        }
        else if (salarioNovo < 4664.68) {
            return (float) (salarioNovo - 636.13);
        }
        return (float) (salarioNovo - 869.36);
    }

    public static void main(String[] args) {
        float rendaMensal = 0;
        int x = 0;
        Scanner print = new Scanner(System.in);
        Trabalhador t1 = new Trabalhador();
        Contador c1 = new Contador();
        System.out.println("Digite a quantidade de funcionarios: ");
        int funcionarios = (print.nextInt());
        while (x++ < funcionarios) {
            System.out.println("Digite o salário bruto do trabalhador: ");
            t1.setSalarioBruto(print.nextFloat());
            System.out.println("Digite a quantidade de dependentes do trabalhador: ");
            t1.setDependentes(print.nextInt());
            rendaMensal +=  t1.getSalarioBruto() - c1.calcularImpostoDeRenda(t1);
            System.out.println(c1.calcularImpostoDeRenda(t1));
        }
        System.out.println("A quantidade de imposto a ser pago é de: " + rendaMensal);
    }
}
