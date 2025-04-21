package atividadesLista;

public class Paciente {
    private String nome;
    private float peso;
    private float altura;
    private float imc;

    public String getNome() {
        return nome;
    }
    public void setNome(String nomeNovo) {
        nome = nomeNovo;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float pesoNovo) {
        peso = pesoNovo;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float alturaNova) {
        altura = alturaNova;
    }
    public float getImc() {
        return imc;
    }
    public void setImc(float imcNovo) {
        imc = imcNovo;
    }
}