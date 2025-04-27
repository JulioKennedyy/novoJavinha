package lista4;

public class Contador {
    public float calcularImpostoDeRenda(Trabalhador trabalhador) {
        float salarioNovo = (float) (trabalhador.getSalarioBruto() - (189.59 * trabalhador.getDependentes()));
        if (trabalhador.getSalario() < 1903.98) {
            float valor = (float) getSalario();
            return valor;
        }
        else if (getSalario() < 2826.6) {;
            return (float) (getSalario() - 142.80);
        }
        else if (getSalario() < 3751.05) {
            return (float) (getSalario() - 354.80);
        }
        else if (getSalario() < 4664.68) {
            return (float) (getSalario() - 636.13);
        }
        return (float) (getSalario() - 869.36);
    }
    }
}
