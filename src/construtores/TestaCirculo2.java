package construtores;

public class TestaCirculo2 {
    public static void main(String[] args) {
        Circulo2 p0 = new Circulo2();
        System.out.println("Construtor com 0 parâmetros");
        System.out.printf("Nome: %s - Cor: %s - Raio: %.2f\n\n", p0.nome, p0.cor, p0.raio);

        System.out.println("Construtor com 1 parâmetro");
        Circulo2 p1 = new Circulo2("Meu círculo");
        System.out.printf("Nome: %s - Cor: %s - Raio: %.2f\n\n", p1.nome, p1.cor, p1.raio);

        System.out.println("Construtor com 2 parâmetros");
        Circulo2 p2 = new Circulo2("Meu outro círculo", "branco");
        System.out.printf("Nome: %s - Cor: %s - Raio: %.2f\n\n", p2.nome, p2.cor, p2.raio);

        System.out.println("Construtor com 3 parâmetros");
        Circulo2 p3 = new Circulo2("Meu ainda outro círculo", "vermelho", 5);
        System.out.printf("Nome: %s - Cor: %s - Raio: %.2f", p3.nome, p3.cor, p3.raio);
    }
}
