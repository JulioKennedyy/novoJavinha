package EstudoXml;

public class Estoque {
    private String nomeDoProduto;
    private float precoDoProduto;

    public Estoque(String nomeDoProduto, float precoDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.precoDoProduto = precoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public float getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(float precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }
}
