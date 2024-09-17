package construtores;

public class Circulo1 {
    public final double PI = 3.14159;

    public String nome;
    public String cor;
    public double raio;

    // Construtor sem parâmetros (no-args)
    public Circulo1() {
        this.nome = "";
        this.cor = "";
    }

    // Construtor personalizado (1 parâmetro)
    public Circulo1(String nome) {
        this.nome = nome;
        this.cor = "";
    }

    // Construtor personalizado (2 parâmetros)
    public Circulo1(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    // Construtor personalizado (3 parâmetros)
    public Circulo1(String nome, String cor, double raio) {
        this.nome = nome;
        this.cor = cor;
        this.raio = raio;
    }

    public double calcularDiametro() {
        double diametro = this.raio * 2;

        return diametro;
    }

    public double calcularArea() {
        return this.PI * (this.raio * this.raio);
    }

    public double calcularPerimetro() {
        return 2 * this.PI * this.raio;
    }

    public void imprimirDados() {
        System.out.printf("%s tem raio %.2f cm\n", this.nome, this.raio);
        System.out.printf("Diâmetro %.4f cm\n", this.calcularDiametro());
        System.out.printf("Perímetro %.4f cm\n", this.calcularPerimetro());
        System.out.printf("Área %.4f cm²\n", this.calcularArea());
    }
}
