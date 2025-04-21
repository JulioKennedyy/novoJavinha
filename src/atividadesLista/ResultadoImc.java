package atividadesLista;

public enum ResultadoImc {
    BAIXO_PESO,
    NORMAL,
    SOBREPESO,
    OBESIDADE;

    public static ResultadoImc classificar(float imc) {
        if (imc < 18.5f) {
            return BAIXO_PESO;
        } else if (imc <= 24.99f) {
            return NORMAL;
        } else if (imc <= 29.99f) {
            return SOBREPESO;
        } else {
            return OBESIDADE;
        }
    }
}