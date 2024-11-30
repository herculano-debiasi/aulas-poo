package geometria_v5;

enum FormasGeometricas {
    FORMA_GEOMETRICA("FormaGeometrica"),
    QUADRADO("Quadrado"),
    RETANGULO("Retangulo"),
    CIRCULO("Circulo");

    private final String descricao;

    FormasGeometricas(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}