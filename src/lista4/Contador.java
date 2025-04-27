package lista4;

public class Contador {
    public float calcularImpostoDeRenda(Trabalhador trabalhador) {
        float salarioNovo = (float) (trabalhador.getSalarioBruto() - (189.59 * trabalhador.getDependentes()));
        if (salarioNovo < 1903.98) {
            float valor = (float) salarioNovo;
            return valor;
        }
        else if (salarioNovo < 2826.6) {;
            return (float) (salarioNovo - 142.80);
        }
        else if (salarioNovo < 3751.05) {
            return (float) (salarioNovo - 354.80);
        }
        else if (salarioNovo < 4664.68) {
            return (float) (salarioNovo - 636.13);
        }
        return (float) (salarioNovo - 869.36);
    }
    }
}
