package Lista9.quest3;

public class Invertida extends FormatacaoTexto{
    @Override
    public String formatarTexto(String texto) {
        String invertida = new StringBuilder(texto).reverse().toString();
        return invertida;
    }
}
