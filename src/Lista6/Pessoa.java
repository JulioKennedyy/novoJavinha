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

    public boolean equals(Pessoa pessoa) {
        if (nome == pessoa.nome && estadoCivil == pessoa.estadoCivil && idade == pessoa.idade) {
            return true;
        }
        return false;
    }
}
