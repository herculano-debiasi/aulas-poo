package aula1709.construtores;

public class AlunoConstrutorParametrizado {
    public static void main(String[] args) {
        System.out.println("Teste com aula1709.construtores parametrizados\n");

        Aluno maria = new Aluno("Maria das Dores", 20, 1.68);
        System.out.printf("%s - Idade: %d anos - Altura: %.2f m\n\n",
                maria.getNome(),
                maria.getIdade(),
                maria.getAltura()
        );

        Aluno pedro = new Aluno("Pedro Pedreira", "Caçador", 50, 1.75);
        System.out.printf("%s - %s - Idade: %d anos - Altura: %.2f m\n\n",
                pedro.getNome(),
                pedro.getEndereco(),
                pedro.getIdade(),
                pedro.getAltura()
        );
    }
}
