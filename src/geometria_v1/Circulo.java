package geometria_v1;

public class Circulo extends FormaGeometrica {
    private int raio;

    // Construtores
    public Circulo() { }

    public Circulo(String cor, String descricao, int raio) {
        this.cor = cor;
        this.descricao = descricao;
        this.raio = raio;
    }

    public void identificar() {
        System.out.println("Eu sou um Círculo");
        System.out.println("Minha cor é: " + this.cor);
        System.out.println("Minha descrição: " + this.descricao);
    }

    // Getters e setters
    public int getRaio() { return raio; }
    public void setRaio(int raio) { this.raio = raio; }
}