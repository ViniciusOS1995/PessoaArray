package persona;

public class Pessoa {
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "nome: " + nome + ", idade: " + idade;
    }
}
