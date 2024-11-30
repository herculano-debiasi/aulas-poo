package geometria_v4;

public class Retangulo extends FormaGeometrica {
    private int base;
    private int altura;

    // Construtores
    public Retangulo() { }

    public Retangulo(String cor, String descricao, int base, int altura) {
        super(cor, descricao);

        this.base = base;
        this.altura = altura;
        this.tipo = FormasGeometricas.RETANGULO;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    // Getters e setters
    public int getBase() { return base; }
    public void setBase(int base) { this.base = base; }

    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = altura; }
}