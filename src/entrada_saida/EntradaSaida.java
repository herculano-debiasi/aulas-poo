package entrada_saida;

import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args) {
        double salario;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o seu salário: ");
        salario = scanner.nextDouble();

        System.out.println(nome + " tem " + idade + " anos e ganha R$ " + salario);
    }
}
