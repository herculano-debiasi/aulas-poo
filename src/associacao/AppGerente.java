package associacao;

public class AppGerente {
    public static void main(String[] args) {
        Funcionario mayco = new Funcionario("Mayco Nunes", "Prof.Dr.");

        Empresa udesc = new Empresa("Cesmo", "DER", false);
        udesc.diretor = mayco;

        System.out.printf("Diretor do %s é o %s",
                udesc.nome,
                udesc.diretor.nomeCompleto());
    }
}