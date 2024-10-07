package repeticao;

public class RepeticaoFor {
    public static void main(String[] args) {
        System.out.print("Lista de números de 1 a 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\nLista de números de 10 a 1: ");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.print("\nLista de números 'pares' de 1 a 10: ");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
    }
}