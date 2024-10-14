package aula1410.listas;

import aula1410.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas1 {
    public static void main(String[] args) {
        // Cria uma lista vazia que irá conter objetos da classe Pessoa
        List<Pessoa> pessoas = new ArrayList<>();

        // Instancia 3 objetos da classe Pessoa
        Pessoa fulano = new Pessoa("Fulano", 25);
        Pessoa beltrano = new Pessoa("Beltrano", 35);
        Pessoa sicrano = new Pessoa("Sicrano", 45);

        // Adiciona objetos à lista
        pessoas.add(fulano);
        pessoas.add(beltrano);
        pessoas.add(sicrano);

        // Acessa elementos específicos da lista
        System.out.println(pessoas.getFirst().nome);
        System.out.println(pessoas.get(1).nome);
        System.out.println(pessoas.getLast().nome);

        System.out.println("-------");

        // Imprime todas as pessoas utilizando o for convencional
        int tamanho = pessoas.size();   // Recupera tamanho atual da lista
        for (int i = 0; i < tamanho; i++) {
            System.out.println(pessoas.get(i).nome);
        }
    }
}
