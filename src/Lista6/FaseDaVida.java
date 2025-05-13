package Lista6;

public enum FaseDaVida {
    INFANCIA("Infância"),
    ADOLESCENTE("Adolescente"),
    ADULTO("Adulto"),
    VELHICE("Velhice");

    private String descricao;

    FaseDaVida(String descricaoNova) {
        descricao = descricaoNova;
    }

    public String getDescricao() {
        return descricao;
    }

    public FaseDaVida determinarFaseDaVida(int idade) {
        if (idade <= 11) {
                return FaseDaVida.INFANCIA;
        } else if (idade <= 20) {
            return FaseDaVida.ADOLESCENTE;
        } else if (idade < 60) {
            return FaseDaVida.ADULTO;
        } else {
            return FaseDaVida.VELHICE;
        }
    }
}

