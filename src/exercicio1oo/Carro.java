package exercicio1oo;

public class Carro {
    public String modelo;
    public int ano;
    public int velocidadeAtual = 0;

    public void acelerar() {
        this.velocidadeAtual += 10;
    }

    public void frear() {
        this.velocidadeAtual -= 10;
    }

    public void exibirVelocidadeAtual() {
        System.out.printf("Velocidade atual do (%s, %d): %d km/h\n",
                this.modelo,
                this.ano,
                this.velocidadeAtual);
    }
}
