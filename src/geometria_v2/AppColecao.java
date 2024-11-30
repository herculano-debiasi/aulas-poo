package geometria_v2;

import java.util.ArrayList;
import java.util.List;

public class AppColecao {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("Vermelho", "Sou uma bola de futebol", 11);
        Circulo c2 = new Circulo("Verde", "Sou uma bola de tênis", 3);
        Circulo c3 = new Circulo("Preta", "Sou uma bola de sinuca", 2);
        Circulo c4 = new Circulo("Laranja", "Sou uma bola de basquete", 15);

        List<Circulo> bolas = new ArrayList<>();
        bolas.add(c1);
        bolas.add(c2);
        bolas.add(c3);
        bolas.add(c4);

        for (FormaGeometrica bola : bolas) {
            bola.identificar();
            System.out.println("---------");
        }

        System.out.println("===================");

        bolas.remove(1);
        bolas.remove(c3);

        for (FormaGeometrica bola : bolas) {
            bola.identificar();
            System.out.println("---------");
        }
    }
}

