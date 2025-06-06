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

    public String toString() {
        return "Conta Corrente: " + numero + " Saldo atual: " + saldo;
    }

    public boolean equals(ContaCorrente p) {
        if(numero.equals(p.numero)) {
            return true;
        }
        return false;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
