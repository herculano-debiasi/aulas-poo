package geometria_v1;

public class FormaGeometrica {
    protected String cor;
    protected String descricao;

    // Construtores
    public FormaGeometrica() { }

    public FormaGeometrica(String cor, String descricao) {
        this.cor = cor;
        this.descricao = descricao;
    }

    public void identificar() {
        System.out.println("Eu sou uma FormaGeometrica");
        System.out.println("Minha cor é: " + this.cor);
        System.out.println("Minha descrição: " + this.descricao);
    }

    // Getters e setters
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}