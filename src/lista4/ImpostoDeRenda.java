package lista4;

import java.util.Scanner;

public class ImpostoDeRenda {
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcularImposto() {
        if (getSalario() < 1903.98) {
            float valor = (float) getSalario();
            return valor;
        }
        else if (getSalario() < 2826.6) {;
            return (float) (getSalario() - 142.80);
        }
        else if (getSalario() < 3751.05) {
            return (float) (getSalario() - 354.80);
        }
        else if (getSalario() < 4664.68) {
            return (float) (getSalario() - 636.13);
        }
        return (float) (getSalario() - 869.36);
    }

    public static void main(String[] args) {
        ImpostoDeRenda sal = new ImpostoDeRenda();
        System.out.printf("Digite seu salário: ");
        Scanner print = new Scanner(System.in);
        sal.setSalario(print.nextInt());
        System.out.println(sal.calcularImposto());
    }
}
