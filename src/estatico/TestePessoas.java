package estatico;

public class TestePessoas {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa("Fulano", 30);
        System.out.println("Número atual de pessoas: " + Pessoa.numPessoas);

        Pessoa beltrano = new Pessoa("Beltrano", 18);
        System.out.println("Número final de pessoas: " + fulano.numPessoas);
    }
}
