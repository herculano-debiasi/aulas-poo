package geometria_v1;

public class Quadrado extends FormaGeometrica {
    private int lado;

    // Construtores
    public Quadrado() { }

    public Quadrado(String cor, String descricao, int lado) {
        this.cor = cor;
        this.descricao = descricao;
        this.lado = lado;
    }

    public void identificar() {
        System.out.println("Eu sou um Quadrado");
        System.out.println("Minha cor é: " + this.cor);
        System.out.println("Minha descrição: " + this.descricao);
    }

    // Getters e setters
    public int getLado() { return lado; }
    public void setLado(int lado) { this.lado = lado; }
}

