package Lista9.quest2;

public class ClienteVip extends Cliente {
    public ClienteVip(String nome, String cpf) {
        super(nome, cpf);
    }

    public void descontoPassagem(float precoPassagem) {
        float valor = precoPassagem - (precoPassagem * 0.35f);
        System.out.println("O preço pago da passagem foi de " + valor + " reais");
    }
}
