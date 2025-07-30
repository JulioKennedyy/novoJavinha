package Lista11.quest4;

import Lista11.quest5.Multa;

public class Radar {
    private float velocidadeMaximaPermitida;

    public Radar(float velocidadeMaximaPermitida) {
        this.velocidadeMaximaPermitida = velocidadeMaximaPermitida;
    }

    public void verificarVelocidade(Veiculo veiculo)
            throws VelocidadeMaximaNaoRespeitadaException, VelocidadeMinimaNaoRespeitadaException {

        float velocidade = veiculo.getVelocidadeAtual();

        if (velocidade > velocidadeMaximaPermitida) {
            float excesso = velocidade - velocidadeMaximaPermitida;
            float porcentagem = (excesso / velocidadeMaximaPermitida) * 100;
            float valorMulta;

            if (porcentagem <= 20) {
                valorMulta = 85.13f;
            } else if (porcentagem <= 50) {
                valorMulta = 127.53f;
            } else {
                valorMulta = 574.62f;
            }

            Multa multa = new Multa(veiculo, valorMulta);

            VelocidadeMaximaNaoRespeitadaException ex = new VelocidadeMaximaNaoRespeitadaException(
                    "Veículo com placa " + veiculo.getPlaca() +
                            " está acima da velocidade permitida! (" + velocidade + " km/h)"
            );
            ex.setMulta(multa);
            throw ex;
        }

        if (velocidade < (velocidadeMaximaPermitida / 2)) {
            Multa multa = new Multa(veiculo, 87.33f);

            VelocidadeMinimaNaoRespeitadaException ex = new VelocidadeMinimaNaoRespeitadaException(
                    "Veículo com placa " + veiculo.getPlaca() +
                            " está abaixo da velocidade mínima permitida! (" + velocidade + " km/h)"
            );
            ex.setMulta(multa);
            throw ex;
        }
    }
}

