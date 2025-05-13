package Lista6;

public class Pessoa {
    private String nome;
    private EstadoCivil estadoCivil;
    private int idade;

    public Pessoa(String nomeBase, EstadoCivil estadoCivilBase, int idadeBase) {
        nome = nomeBase;
        estadoCivil = estadoCivilBase;
        idade = idadeBase;
    }

    public Pessoa() {
        nome = "Desconhecido";
        estadoCivil = EstadoCivil.SOLTEIRO;
        idade = 18;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean equals(Pessoa pessoa) {
        if (nome == pessoa.nome && estadoCivil == pessoa.estadoCivil && idade == pessoa.idade) {
            return true;
        }
        return false;
    }

    private FaseDaVida determinarFaseDaVida(int idade) {
        if (idade <= 11) {
            return FaseDaVida.INFANCIA;
        } else if (idade <= 20) {
            return FaseDaVida.ADOLESCENTE;
        } else if (idade < 60) {
            return FaseDaVida.ADULTO;
        } else {
            return FaseDaVida.VELHICE;
        }
    }

    public String toString() {
        return determinarFaseDaVida(idade).toString();
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(25);
        System.out.println(p.toString());
    }
}
