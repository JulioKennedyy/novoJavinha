package Lista9.quest2;

public class Cliente {
    private String nome;
    private String cpf;

    public void descontoPassagem(float precoPassagem) {
        System.out.println("O preço pago da passagem foi de " + precoPassagem + " reais");
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
