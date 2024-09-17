package aula1709.exercicio1oo;

public class ContaBancaria {
    public String nome;
    public double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void informarSaldo() {
        System.out.printf("Saldo atual de %s é R$ %.2f\n", this.nome, this.saldo);
    }

}
