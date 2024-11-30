package associacao;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public String nome;
    public String endereco;
    public boolean matriz;

    public Funcionario diretor;
    public List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome, String endereco, boolean matriz) {
        this.nome = nome;
        this.endereco = endereco;
        this.matriz = matriz;
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários da empresa " + this.nome + ":");
        System.out.println("-----------------------");

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.nome);
        }
    }
}

