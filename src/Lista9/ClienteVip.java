package Lista9;

public class ClienteVip extends Cliente{
    public void descontoPassagem(float precoPassagem) {
        float valor = precoPassagem * 0.35f;
        System.out.println("O preço pago da passagem foi" + valor + " reais");
    }
}
