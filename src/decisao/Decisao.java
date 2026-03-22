package decisao;

import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int numero;

        System.out.print("Entre com um número entre 1 e 50: ");
        numero = scanner.nextInt();

        if (numero == 42) {
            System.out.println("Acertou!!!");
        } else {
            System.out.println("Errou!!!");
        }
    }
}
