package aula1410.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OperacoesListasNotas {
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>(Arrays.asList(10, 8, 9, 7));

        System.out.println("Tamanho da lista: " + notas.size());
        System.out.println("Lista vazia? " + (notas.isEmpty() ? "Sim" : "Não"));

        System.out.println("\nMaior valor: " + Collections.max(notas));
        System.out.println("Menor valor: " + Collections.min(notas));

        System.out.println("\nOrdenações:");
        Collections.sort(notas);
        System.out.println(notas);

        Collections.reverse(notas);
        System.out.println(notas);

        notas.clear();
        System.out.println("\nTamanho da lista: " + notas.size());
        System.out.println("Lista vazia? " + (notas.isEmpty() ? "Sim" : "Não"));
    }
}
