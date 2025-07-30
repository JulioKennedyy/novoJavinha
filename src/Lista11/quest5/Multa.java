package Lista11.quest5;

import Lista11.quest4.Veiculo;

public class Multa {
    private Veiculo veiculo;
    private float valor;

    public Multa(Veiculo veiculo, float valor) {
        this.veiculo = veiculo;
        this.valor = valor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Multa para o veículo com placa " + veiculo.getPlaca() +
                " no valor de R$ " + String.format("%.2f", valor);
    }
}
