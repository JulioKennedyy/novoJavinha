package Lista7;

public class ContaPoupanca {
    private float saldo;
    private String titular;
    private String numero;
    public float taxaDeRendimento;

    public ContaPoupanca(float saldo, String titular, String numero, float taxaDeRendimento) {
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public String toString() {
        return "Conta Poupança: " + numero + "Saldo atual: " + saldo;
    }

    public boolean equals(ContaPoupanca p) {
        if(numero.equals(p.numero)) {
            return true;
        }
        return false;
    }
}
