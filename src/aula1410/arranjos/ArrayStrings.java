package aula1410.arranjos;

public class ArrayStrings {
    public static void main(String[] args) {
        String frutas[] = {"Uva", "Banana", "Maçã"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        System.out.println("-------");

        System.out.println("Exemplo de laço for each:");
        for (String fruta: frutas) {
            System.out.println(fruta);
        }
    }
}
