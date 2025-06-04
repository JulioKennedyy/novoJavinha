package Lista8;

public abstract class OperacaoMatematica {
    public int operando1;
    public int operando2;

    public abstract float retornarResultado();
    public abstract void imprimirResultado();

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
