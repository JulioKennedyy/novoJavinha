package lista4;

import java.util.Scanner;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    int equilatero = 0;
    int escaleno = 0;
    int isoceles = 0;

    public TiposDeTriangulo tipo() {
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Total de equilatero: " + ++equilatero);
            return TiposDeTriangulo.Equilatero;
        }
        else if (lado1 != lado2 && lado1 != lado3) {
            System.out.println("Total de Escaleno: " + ++escaleno);
            return TiposDeTriangulo.Escaleno;
        }
        else {
            System.out.println("Total de isoceles: " + ++isoceles);
            return TiposDeTriangulo.ISoceles;
        }
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        Scanner print = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o primeiro lado: ");
            t.setLado1(print.nextInt());
            System.out.println("Digite o segundo lado: ");
            t.setLado2(print.nextInt());
            System.out.println("Digite o terceiro lado: ");
            t.setLado3(print.nextInt());
            print.nextLine();
            System.out.println(t.tipo());
            System.out.println("Deseja sair? digite x caso sim: ");
            String escolha = print.nextLine();
            if (escolha.equals("x")) {
                break;
            }
        }
    }
}
