package Lista8;

public class Somar extends OperacaoMatematica{

    @Override
    protected float retornarResultado() {
        return operando1 + operando2;
    }

    @Override
    protected void imprimirResultado() {
        System.out.println(operando1 + operando2);
    }
}
