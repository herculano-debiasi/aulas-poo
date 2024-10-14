package aula1410.arranjos;

import aula1410.Pessoa;

public class ArrayPessoas {
    public static void main(String[] args) {
        // Criação de constante
        final int NUM_PESSOAS = 3;

        // Declaração do array
        Pessoa pessoas[] = new Pessoa[NUM_PESSOAS];

        // Criação de objetos e atribuição aos elementos do array
        pessoas[0] = new Pessoa("Fulano", 25);
        pessoas[1] = new Pessoa("Beltrano", 35);
        pessoas[2] = new Pessoa("Sicrano", 45);

        // Lista as pessoas utilizando o for convencional
        for (int i = 0; i < NUM_PESSOAS; i++) {
            System.out.println("Nome: " + pessoas[i].nome +
                    " - idade: " + pessoas[i].idade);
        }

        System.out.println("---------------");

        // Lista as pessoas utilizando o for aprimorado
        for (Pessoa pessoa: pessoas) {
            System.out.println("Nome: " + pessoa.nome +
                    " - idade: " + pessoa.idade);
        }
    }
}
