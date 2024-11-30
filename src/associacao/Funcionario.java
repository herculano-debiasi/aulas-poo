package associacao;

public class Funcionario {
    public String nome;
    public String titulo;

    public Funcionario(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }

    public String nomeCompleto() {
        return this.titulo + this.nome;
    }
}