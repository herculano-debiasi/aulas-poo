package geometria_v6;

public class Circulo extends FormaGeometrica {
    private final double PI = 3.14159;
    private int raio;

    // Construtores
    public Circulo() { }

    public Circulo(String cor, String descricao, int raio) {
        super(cor, descricao);

        this.raio = raio;
    }

    @Override
    public void identificar() {
        super.identificar();
        System.out.printf("Medida do raio: %d\n", this.raio);
    }

    @Override
    public double calcularArea() {
        return this.PI * (this.raio * this.raio);
    }

    // Getters e setters
    public int getRaio() { return raio; }
    public void setRaio(int raio) { this.raio = raio; }
}