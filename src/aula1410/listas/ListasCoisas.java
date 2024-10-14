package aula1410.listas;

import java.util.ArrayList;

public class ListasCoisas {
    public static void main(String[] args) {
        // Criando uma lista
        ArrayList coisas = new ArrayList();

        // Adicionando elementos
        coisas.add("Um nome");
        coisas.add(true);
        coisas.add(42);
        coisas.add(123.45);

        // Acessando elementos individuais com get()
        System.out.println(coisas.getFirst());
        System.out.println(coisas.get(2));
        System.out.println(coisas.getLast());

        // Removendo elementos
        coisas.remove(1);

        System.out.println("-------");

        // Determina o tamanho do array em tempo de execução
        int tamanho = coisas.size();

        System.out.println("Mostrando todos os elementos utilizando <for> convencional:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(coisas.get(i));
        }
    }
}
