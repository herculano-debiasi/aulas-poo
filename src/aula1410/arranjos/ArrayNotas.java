package aula1410.arranjos;

public class ArrayNotas {
    public static void main(String[] args) {
        // Declaração do array
        int[] notas = new int[4];

        // Atribuição dos valores
        notas[0] = 10;
        notas[1] = 8;
        notas[2] = 9;
        notas[3] = 7;

        // Acesso aos elementos
        System.out.println("1ª nota: " + notas[0]);
        System.out.println("2ª nota: " + notas[1]);
        System.out.println("3ª nota: " + notas[2]);
        System.out.println("4ª nota: " + notas[3]);

        System.out.println("-------");

        // Lista as notas utilizando o for convencional
        System.out.println("Exemplo de laço <for> convencional:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("-------");

        // Determina o tamanho do array em tempo de execução
        int tamanho = notas.length;

        System.out.println("Exemplo de determinação de tamanho em tempo de execução:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("-------");

        // Lista as notas utilizando o for aprimorado
        System.out.println("Exemplo de laço <for-each> (for aprimorado):");
        for (int nota: notas) {
            System.out.println(nota);
        }

        System.out.println("-------");

        // Inicialização na declaração
        int[] valores = {1, 2, 3, 4};

        // Lista os valores utilizando o for aprimorado
        System.out.println("Inicialização na declaração:");
        for (int valor: valores) {
            System.out.println(valor);
        }
    }
}
