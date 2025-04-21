public class Nutricionista {
    public String avaliarImc(float peso, float altura) {
        float imc = peso / altura * altura;
        ResultadoImc resultado = ResultadoImc.classificar(imc);
        return resultado.toString();
    }
}