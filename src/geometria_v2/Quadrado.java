package geometria_v2;

public class Quadrado extends FormaGeometrica {
    private int lado;

    // Construtores
    public Quadrado() { }

    public Quadrado(String cor, String descricao, int lado) {
        super(cor, descricao);
        this.lado = lado;
    }

    @Override
    public void identificar() {
        System.out.println("Eu sou um Quadrado");
        super.identificar();
    }

    // Getters e setters
    public int getLado() { return lado; }
    public void setLado(int lado) { this.lado = lado; }
}