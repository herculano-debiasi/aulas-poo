package aula1709.exercicio1oo;

public class TestaLivro {
    public static void main(String[] args) {
        Livro java = new Livro();
        java.nome = "Java";
        java.autor = "James Gosling";
        java.ano = 2024;
        java.editora = "Java-lee";

        java.status();

        java.emprestar();
        java.status();
        if (java.estahEmprestado()) {
            System.out.println("Livro Java está atualmente emprestado!");
        }

        java.devolver();
        java.status();
        if (java.estahDisponivel()) {
            System.out.println("Livro Java está disponível para empréstimo!");
        }
    }
}
