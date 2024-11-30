package estatico;

public class Pessoa {
    public String nome;
    public int idade;
    public static int numPessoas = 0;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        numPessoas++;
    }
}
