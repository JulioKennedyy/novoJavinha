package Lista9;

public class Pokemon{
    private String nome;
    private String tipo;
    private int nivel;

    private Ataques ataqueA;
    private Ataques ataqueB;
    private Ataques ataqueC;
    private Ataques ataqueD;

    public Pokemon(String nome, String tipo, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        ataqueA = new AtaqueVazio();
        ataqueB = new AtaqueVazio();
        ataqueC = new AtaqueVazio();
        ataqueD = new AtaqueVazio();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setAtaqueA(Ataques ataqueA) {
        this.ataqueA = ataqueA;
    }

    public void setAtaqueB(Ataques ataqueB) {
        this.ataqueB = ataqueB;
    }

    public void setAtaqueC(Ataques ataqueC) {
        this.ataqueC = ataqueC;
    }

    public void setAtaqueD(Ataques ataqueD) {
        this.ataqueD = ataqueD;
    }
}
