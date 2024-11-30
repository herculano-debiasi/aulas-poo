package estatico;

public class TesteEstatico {
    // final: constante
    // static:
    public static final double PI = 3.1415;
    int numero = 42;

    public static void main(String[] args) {
        TesteEstatico te = new TesteEstatico();
        te.numero = 25;
        System.out.println(te.numero);
        System.out.println(TesteEstatico.PI);

        System.out.println(Matematica.max(10, 5));
    }
}
