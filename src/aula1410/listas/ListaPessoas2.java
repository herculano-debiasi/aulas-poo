package aula1410.listas;

import aula1410.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas2 {
    public static void main(String[] args) {
        // Cria uma lista vazia que irá conter objetos da classe Pessoa
        List<Pessoa> pessoas = new ArrayList<>();

        // Instancia 3 objetos da classe Pessoa
        pessoas.add(new Pessoa("Fulano", 25));
        pessoas.add(new Pessoa("Beltrano", 35));
        pessoas.add(new Pessoa("Sicrano", 45));

        // Acessa elementos específicos da lista
        System.out.println(pessoas.getFirst().nome);
        System.out.println(pessoas.get(1).nome);
        System.out.println(pessoas.getLast().nome);

        System.out.println("-------");

        // Imprime todas as pessoas utilizando o for aprimorado
        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa.nome);
        }
    }
}
