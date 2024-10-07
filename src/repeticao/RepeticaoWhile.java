package repeticao;

public class RepeticaoWhile {
    public static void main(String[] args) {
        System.out.print("Lista de números de 1 a 10: ");
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }

        System.out.print("\nLista de números de 10 a 1: ");
        num = 10;
        while (num > 0) {
            System.out.print(num + " ");
            num--;
        }

        System.out.print("\nLista de números 'pares' de 1 a 10: ");
        num = 2;
        while (num <= 10) {
            System.out.print(num + " ");
            num += 2;
        }
    }
}
