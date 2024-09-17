package construtores;

public class Aluno {
    private String nome;
    private String endereco;
    private int idade;
    private double altura;

    // Construtor sem parâmetros (no-arg)
    public Aluno() {
        System.out.println("Criando um aluno...");
        this.nome = "";
        this.endereco = "";
        this.idade = 18;
        this.altura = 1.7;
    }

    // Construtor personalizado / parametrizado com 2 parâmetros
    public Aluno(String nome, int idade) {
        System.out.println("Construtor com 2 parâmetros...");

        this.nome = nome;
        this.idade = idade;
    }

    // Construtor personalizado / parametrizado com 3 parâmetros
    public Aluno(String n, int i, double a) {
        System.out.println("Construtor com 3 parâmetros...");

        nome = n;
        idade = i;
        altura = a;
    }

    // Construtor personalizado / parametrizado com 4 parâmetros
    public Aluno(String nome, String endereco, int idade, double altura) {
        System.out.println("Construtor com 4 parâmetros...");

        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return this.endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public int getIdade() { return this.idade; }
    public void setIdade(int idade) {
        if (idade>=0) {
            this.idade = idade;
        } else {
            System.out.println("idade inválida");
        }
    }

    public double getAltura() { return this.altura; }
    public void setAltura(double altura) { this.altura = altura; }
}
