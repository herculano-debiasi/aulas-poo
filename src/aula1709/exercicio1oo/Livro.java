package aula1709.exercicio1oo;

public class Livro {
    public String nome;
    public String editora;
    public String autor;
    public int ano;
    public boolean status; // True: emprestado, False: disponível

    public void emprestar() {
        this.status = true;
        System.out.printf("Livro %s sendo emprestado...\n", this.nome);
    }

    public void devolver() {
        this.status = false;
        System.out.printf("Livro %s sendo devolvido...\n", this.nome);
    }

    public void status() {
        if (status) {
            System.out.printf("Livro %s está emprestado!\n", this.nome);
        } else {
            System.out.printf("Livro %s está disponível!\n", this.nome);
        }
    }

    public boolean estahDisponivel() {
        return !this.status;
    }

    public boolean estahEmprestado() {
        return this.status;
    }
}
