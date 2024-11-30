package geometria_v4;

import java.util.ArrayList;
import java.util.List;

public class AppPolimorfismo {
    public static void main(String[] args) {
        FormaGeometrica fg = new FormaGeometrica("Azul", "Sou uma forma abstrata");
        Circulo c = new Circulo("Vermelho", "Sou uma bola", 10);
        Quadrado q = new Quadrado("Roxo", "Sou quadradão", 10);
        Retangulo r = new Retangulo("Amarelo", "Sou retangular", 10, 2);

        List<FormaGeometrica> objetos = new ArrayList<>();
        objetos.add(fg);
        objetos.add(c);
        objetos.add(q);
        objetos.add(r);

        for (FormaGeometrica objeto : objetos) {
            if (objeto.tipo == FormasGeometricas.FORMA_GEOMETRICA) {
                System.out.println("Minha área não é definida!");
            } else {
                System.out.printf("%s e minha área é %.2f cm²\n",
                        objeto.getDescricao(),
                        objeto.calcularArea());
            }
        }
    }
}

