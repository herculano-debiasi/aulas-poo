package associacao;

public class AppFuncionarios {
    public static void main(String[] args) {
        Empresa udesc = new Empresa("Cesmo", "DER", false);

        Funcionario fulano = new Funcionario("Fulano", "Sr.");
        Funcionario sicrano = new Funcionario("Sicrano", "Sr.");
        Funcionario maria = new Funcionario("Maria", "Sra.");
        Funcionario mayco = new Funcionario("Mayco Nunes", "Prof.Dr.");

        udesc.funcionarios.add(mayco);
        udesc.funcionarios.add(fulano);
        udesc.funcionarios.add(sicrano);
        udesc.funcionarios.add(maria);

        udesc.listarFuncionarios();
    }
}

