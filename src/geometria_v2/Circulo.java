package geometria_v2;

public class Circulo extends FormaGeometrica {
    private int raio;

    // Construtores
    public Circulo() { }

    public Circulo(String cor, String descricao, int raio) {
        super(cor, descricao);
        this.raio = raio;
    }

    @Override
    public void identificar() {
        System.out.println("Eu sou um Círculo");
        super.identificar();
    }

    // Getters e setters
    public int getRaio() { return raio; }
    public void setRaio(int raio) { this.raio = raio; }
}