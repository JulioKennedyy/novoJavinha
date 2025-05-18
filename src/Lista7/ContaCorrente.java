package Lista7;

public class ContaCorrente {
    private float saldo;
    private String titular;
    private String numero;
    private float chequeEspecial;

    public ContaCorrente(float saldo, String titular, String numero, float chequeEspecial) {
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
        this.chequeEspecial = chequeEspecial;
    }
}
