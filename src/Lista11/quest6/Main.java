package Lista11.quest6;

import Lista11.quest4.Radar;
import Lista11.quest4.Veiculo;
import Lista11.quest4.VelocidadeMaximaNaoRespeitadaException;
import Lista11.quest4.VelocidadeMinimaNaoRespeitadaException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Radar radar = new Radar(90.0f);
        List<Veiculo> veiculos = new ArrayList<>();
        Random random = new Random();


        for (int i = 1; i <= 100; i++) {
            String placa = "CAR" + String.format("%04d", i);
            float velocidade = 40 + random.nextFloat() * (150 - 40);
            Veiculo veiculo = new Veiculo(placa, velocidade, "Proprietário " + i);
            veiculos.add(veiculo);
        }

        int totalMultas = 0;
        float valorTotalMultas = 0;

        System.out.println("🛣️  Radar de velocidade operando...\n");

        for (Veiculo v : veiculos) {
            try {
                radar.verificarVelocidade(v);
                System.out.println("✔ " + v.getPlaca() + " está dentro do limite. (" + v.getVelocidadeAtual() + " km/h)");
            } catch (VelocidadeMaximaNaoRespeitadaException e) {
                totalMultas++;
                float valor = e.getMulta().getValor();
                valorTotalMultas += valor;
                System.out.println("🚨 " + e.getMessage());
                System.out.println("💰 Multa: R$ " + String.format("%.2f", valor));
            } catch (VelocidadeMinimaNaoRespeitadaException e) {
                totalMultas++;
                float valor = e.getMulta().getValor();
                valorTotalMultas += valor;
                System.out.println("⚠️ " + e.getMessage());
                System.out.println("💰 Multa: R$ " + String.format("%.2f", valor));
            }
        }

        System.out.println("Total de multas aplicadas: " + totalMultas);
        System.out.println("Valor total arrecadado: R$ " + String.format("%.2f", valorTotalMultas));
    }
}

