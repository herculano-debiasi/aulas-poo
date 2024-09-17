package aula1709.construtores;

import java.util.Scanner;

public class TestaCirculo1 {
    public static void main(String[] args) {
        Circulo1 c1 = new Circulo1();
        System.out.println("Criando círculo com valores padrões");
        System.out.printf("Nome: %s - Cor: %s - Raio: %.2f\n\n", c1.nome, c1.cor, c1.raio);

        System.out.println("Criando círculo com valores informados");
        Circulo1 c2 = new Circulo1("Meu círculo", "azul", 10);
        System.out.printf("Nome: %s - Cor: %s - Raio: %.2f\n\n", c2.nome, c2.cor, c2.raio);

        // Exemplo interativo para o usuário informar o raio
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        Circulo1 circulo = new Circulo1("meu círculo", "azul", raio);
        circulo.imprimirDados();
        System.out.println(circulo.calcularPerimetro());
    }
}
