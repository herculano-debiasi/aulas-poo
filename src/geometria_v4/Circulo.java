package geometria_v4;

public class Circulo extends FormaGeometrica {
    private final double PI = 3.14159;
    private int raio;

    // Construtores
    public Circulo() { }

    public Circulo(String cor, String descricao, int raio) {
        super(cor, descricao);

        this.raio = raio;
        this.tipo = FormasGeometricas.CIRCULO;
    }

    @Override
    public double calcularArea() {
        return this.PI * (this.raio * this.raio);
    }

    // Getters e setters
    public int getRaio() { return raio; }
    public void setRaio(int raio) { this.raio = raio; }
}