package Lista8;

public class Dividir extends OperacaoMatematica{
    @Override
    public float retornarResultado() {
        return operando1 / operando2;
    }

    @Override
    public void imprimirResultado() {
        System.out.println(retornarResultado());
    }
}
