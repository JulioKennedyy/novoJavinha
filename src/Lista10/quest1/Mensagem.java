package Lista10.quest1;

public class Mensagem {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Mensagem: " + texto;
    }

    public Mensagem(String texto) {
        this.texto = texto;
    }
}
