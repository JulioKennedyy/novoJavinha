package EstudosPessoais;

public class Cobrador {
    private float valorDaPassagem;
    private float carteiraDeEstudante;
    private int rotacaoDaCatraca;
    private float caixaDoOnibus;

    public Cobrador(float valorDaPassagem, float descontoDaCarteiraEstudante) {
        descontoDaCarteiraEstudante = 2;
        this.valorDaPassagem = valorDaPassagem;
        this.carteiraDeEstudante = valorDaPassagem/descontoDaCarteiraEstudante;
    }

    public float getCaixaDoOnibus() {
        return caixaDoOnibus;
    }

    public void setCaixaDoOnibus(float caixaDoOnibus) {
        if(caixaDoOnibus <= 0) {
            this.caixaDoOnibus = this.caixaDoOnibus;
        }
        else {
            this.caixaDoOnibus = caixaDoOnibus;
        }
    }

    public float getValorDaPassagem() {
        return valorDaPassagem;
    }

    public void setValorDaPassagem(float valorDaPassagem) {
        if(valorDaPassagem <= 0) {
            this.valorDaPassagem = 0;
        }
        else {
            this.valorDaPassagem = valorDaPassagem;
        }
    }

    public float getCarteiraDeEstudante() {
        return carteiraDeEstudante;
    }

    public void setCarteiraDeEstudante(float carteiraDeEstudante) {
        this.carteiraDeEstudante = carteiraDeEstudante;
    }

    public int getRotacaoDaCatraca() {
        return rotacaoDaCatraca;
    }

    public void setRotacaoDaCatraca(int rotacaoDaCatraca) {
        this.rotacaoDaCatraca = rotacaoDaCatraca;
    }

    public String toString() {
        return "O valor da passagem é: " + getValorDaPassagem() + ", O desconto para estudantes é de: " + getCarteiraDeEstudante() + ", A catraca girou " + getRotacaoDaCatraca() + " vezes. O caixa do onibus tem: " + caixaDoOnibus;
    }

    public String pagarPassagem(Passageiro p) {
        if(p.isTemCarteirinha()) {
            if(p.getDinheiro() < getCarteiraDeEstudante())
                return "Valor insuficiente";
            else {
                p.setDinheiro(p.getDinheiro() - getCarteiraDeEstudante());
                rotacaoDaCatraca++;
                caixaDoOnibus+=carteiraDeEstudante;
                return "Pode passar. Saldo: " + p.getDinheiro();
            }
        }
        else {
            if(p.getDinheiro() < getValorDaPassagem())
                return "Valor insuficiente";
            else {
                p.setDinheiro(p.getDinheiro() - getValorDaPassagem());
                rotacaoDaCatraca++;
                caixaDoOnibus+=valorDaPassagem;
                return "Pode passar. Saldo: " + p.getDinheiro();
            }
        }
    }
}
