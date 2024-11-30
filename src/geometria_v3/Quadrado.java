package geometria_v3;

public class Quadrado extends FormaGeometrica {
    private int lado;

    // Construtores
    public Quadrado() { }

    public Quadrado(String cor, String descricao, int lado) {
        super(cor, descricao);

        this.lado = lado;
        this.tipo = FormasGeometricas.QUADRADO;
    }

    // Getters e setters
    public int getLado() { return lado; }
    public void setLado(int lado) { this.lado = lado; }
}