package heranca;

public class App {
    public static void main(String[] args) {
        Animal trex = new Animal();
        trex.setNome("Tiranossauro Rex");
        System.out.println(trex.getNome());

        Pessoa fulano = new Pessoa();
        fulano.setNome("Fulano da Silva");
        System.out.println(fulano.getNome());

        Ave pinguim = new Ave();
        pinguim.setNome("Pinguino");
        System.out.println(pinguim.getNome());
    }
}
