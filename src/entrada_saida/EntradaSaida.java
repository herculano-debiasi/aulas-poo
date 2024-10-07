package entrada_saida;

import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args) {
        String nome;
        int idade;
        double salario;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Digite o seu salário: ");
        salario = scanner.nextDouble();

        System.out.println(nome + " tem " + idade + " anos e ganha R$ " + salario);
    }
}
