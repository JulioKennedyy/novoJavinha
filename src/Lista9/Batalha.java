package Lista9;

public class Batalha {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "eletrico", 12);
        pikachu.setAtaqueA(new AtaqueFisico("Investida", 15));
        pikachu.setAtaqueB(new AtaqueEspecial("Discarga", 35, "paralisia"));
        pikachu.usarAtaqueB();
    }
}
