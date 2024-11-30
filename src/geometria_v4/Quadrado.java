package geometria_v4;

public class Quadrado extends FormaGeometrica {
    private int lado;

    // Construtores
    public Quadrado() { }

    public Quadrado(String cor, String descricao, int lado) {
        super(cor, descricao);

        this.lado = lado;
        this.tipo = FormasGeometricas.QUADRADO;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    // Getters e setters
    public int getLado() { return lado; }
    public void setLado(int lado) { this.lado = lado; }
}