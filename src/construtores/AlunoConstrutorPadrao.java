package construtores;

public class AlunoConstrutorPadrao {
    public static void main(String[] args) {
        System.out.println("Teste com construtor no-args (sem argumentos)\n");

        Aluno ze = new Aluno();
        ze.setNome("Zé da Silva");
        ze.setIdade(-100);
        System.out.printf("%s - Idade: %d anos\n\n",
                    ze.getNome(),
                    ze.getIdade()
                );
    }
}
