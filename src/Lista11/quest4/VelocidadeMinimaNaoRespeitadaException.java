package Lista11.quest4;

import Lista11.quest5.Multa;

public class VelocidadeMinimaNaoRespeitadaException extends Exception {
    private Multa multa;

    public VelocidadeMinimaNaoRespeitadaException(String mensagem) {
        super(mensagem);
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    public Multa getMulta() {
        return multa;
    }
}