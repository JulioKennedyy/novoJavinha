package Lista11.quest2;

public class Impressora {
    private int quantidadeDePaginas;
    private float cargaToner;

    public Impressora() {
        this.quantidadeDePaginas = 0;
        this.cargaToner = 100;
    }

    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    public void setQuantidadeDePaginas(int quantidadeDePaginas) {
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public float getCargaToner() {
        return cargaToner;
    }

    public void setCargaToner(float cargaToner) {
        this.cargaToner = cargaToner;
    }

    public int imprimir(int quantidadeDePaginas) throws FaltouPapelException, FaltouTintaException {
        for (int i = 0; i < quantidadeDePaginas; i++) {
            if (getQuantidadeDePaginas() <= 0) {
                throw new FaltouPapelException("Sem papel!", quantidadeDePaginas - i);
            }
            if (getCargaToner() <= 0) {
                throw new FaltouTintaException("Sem tinta!", quantidadeDePaginas - i);
            }

            setQuantidadeDePaginas(getQuantidadeDePaginas() - 1);
            setCargaToner(getCargaToner() - 0.35f);
        }
        return quantidadeDePaginas;
    }
}
