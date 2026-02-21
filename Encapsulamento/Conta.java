package Encapsulamento;

public class Conta {
    private String nome;
    private double valor;
    private double conta;
    private double saca;

    public Conta(String nome) {
        this.nome = nome;
    }

    private void depositar(double num){
        if (num >0){
            conta = num;
        }else{
            System.out.printf("Erro");
        }
    }
    private void sacar(double nume){
        saca = conta - nume;
        if (saca<0){
            System.out.printf("Saldo insuficiente\n");
        }else{
            System.out.printf("Saque realizado com sucesso\n");
        }
    }
    private void exibirSaldo(){
        if (saca>0) {
            System.out.printf("Saldo atual de %s: %.2f",nome, saca);
        }else{
            System.out.printf("Saldo atual de %s: %.2f",nome, conta);
        }
    }

    static void main(String[] args) {
        Conta conta = new Conta("Ana");
        conta.depositar(1000.00);
        conta.sacar(200.00);
        conta.exibirSaldo();
    }
}
