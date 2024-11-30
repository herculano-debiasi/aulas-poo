package geometria_v2;

public class App {
    public static void main(String[] args) {
        FormaGeometrica fg = new FormaGeometrica("Azul", "Sou uma forma abstrata");
        fg.identificar();
        System.out.println("--------------------");

        Circulo c = new Circulo("Vermelho", "Sou uma bola", 10);
        c.identificar();
        System.out.println("--------------------");

        Quadrado q = new Quadrado("Roxo", "Sou quadradão", 10);
        q.identificar();
        System.out.println("--------------------");

        Retangulo r = new Retangulo("Amarelo", "Sou retangular", 10, 2);
        r.identificar();
    }
}