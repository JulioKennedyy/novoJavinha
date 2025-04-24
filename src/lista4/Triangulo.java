package lista4;

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

    public Variacao tipo() {
        if (lado1 == lado2 && lado1 == lado3) {
            return Variacao.Equilatero;
        }
        else if (lado1 != lado2 && lado1 != lado3) {
            return Variacao.Escaleno;
        }
        else {
            return Variacao.ISoceles;
        }
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.setLado1(10);
        t.setLado2(2);
        t.setLado3(1);
        System.out.println(t.tipo());
    }
}
