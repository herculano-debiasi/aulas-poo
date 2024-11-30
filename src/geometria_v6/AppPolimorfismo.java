package geometria_v6;

import java.util.ArrayList;
import java.util.List;

public class AppPolimorfismo {
    public static void main(String[] args) {
        // Linha abaixo gera erro, pois classe FormaGeometrica é agora abstrata
        //FormaGeometrica fg = new FormaGeometrica("Azul", "Sou uma forma abstrata");

        Circulo c = new Circulo("Vermelho", "Sou uma bola", 10);
        Quadrado q = new Quadrado("Roxo", "Sou quadradão", 10);
        Retangulo r = new Retangulo("Amarelo", "Sou retangular", 10, 2);

        List<FormaGeometrica> objetos = new ArrayList<>();
        objetos.add(c);
        objetos.add(q);
        objetos.add(r);

        for (FormaGeometrica objeto : objetos) {
            objeto.identificar();
            System.out.println("==========");
        }
    }
}