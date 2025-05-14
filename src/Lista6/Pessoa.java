package Lista6;

import java.util.Scanner;

import static Lista6.EstadoCivil.CASADO;

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
        if (nome.equals(pessoa.getNome()) && estadoCivil.equals(pessoa.getEstadoCivil()) && idade == pessoa.getIdade()) {
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
        Pessoa[] pessoas = new Pessoa[100];
        int count = 0;
        int solteiros = 0;
        int casados = 0;
        int erros = 0;
        Scanner print = new Scanner(System.in);
        while (true) {
            Pessoa l = new Pessoa();

            System.out.println("Digite o nome: ");
            l.setNome(print.nextLine());
            System.out.println("Digite sua idade: ");
            l.setIdade(print.nextInt());
            System.out.println("Digite seu estado civil(Solteiro, Casado, Viuvo, Separado): ");
            print.nextLine();
            String entradaEstado = print.nextLine().toUpperCase();
            EstadoCivil estadoCivil = EstadoCivil.valueOf(entradaEstado);


            for(Pessoa p: pessoas) {
                if (p == null) {
                    continue;
                }
                else if(l.equals(p)) {
                    System.out.println("Não é possivel adicionar pessoas iguais");
                    erros ++;
                    break;
                }
            }
            System.out.println("Digite x caso queira parar a execução: ");
            String sair = (print.nextLine());
            pessoas[count] = l;
            count++;
            if (sair.equalsIgnoreCase("x")) {
                break;
            }

        }
        for(Pessoa p : pessoas) {
            if(p != null) {
                if(p.getEstadoCivil().equals(EstadoCivil.CASADO)) {
                    casados++;
                }
                else if(p.getEstadoCivil() != EstadoCivil.CASADO) {
                    solteiros++;
                }
                System.out.println(p.toString());
            }
            else {
                break;
            }
        }
        System.out.println("A quantidade de solteiros é: " + solteiros);
        System.out.println("A quantidade de casados é: " + casados);
        System.out.println("A quantidade de erros é: " + casados);
    }
}
