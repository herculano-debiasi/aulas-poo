package geometria_v3;

public class Circulo extends FormaGeometrica {
    private int raio;

    // Construtores
    public Circulo() { }

    public Circulo(String cor, String descricao, int raio) {
        super(cor, descricao);

        this.raio = raio;
        this.tipo = FormasGeometricas.CIRCULO;
    }

    // Getters e setters
    public int getRaio() { return raio; }
    public void setRaio(int raio) { this.raio = raio; }
}