package aula1410.listas;

import java.util.ArrayList;
import java.util.List;

public class ListasNotas {
    public static void main(String[] args) {
        // Criando uma lista de inteiros
        List<Integer> notas = new ArrayList<>();

        // Adiciona elementos à lista
        notas.add(10);
        notas.add(8);
        notas.add(9);
        notas.add(7);
//        notas.add("Palavra"); // erro de compilação (verificação de tipos)

        // Determina o tamanho do array em tempo de execução
        int tamanho = notas.size();

        System.out.println("Laço <for> convencional:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(notas.get(i));
        }

        System.out.println("-------");

        // Adiciona no início da lista
        notas.add(0, 5);

        System.out.println("Laço <for-each> (for aprimorado):");
        for (Integer nota : notas) {
            System.out.println(nota);
        }
    }
}
