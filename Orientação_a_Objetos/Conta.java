package Orientação_a_Objetos;

public class Conta {
    double valor;
    void zerar(){
        valor = 0;
    }
    void mostrar(){
        System.out.printf("Seu saldo atual é:R$ %.2f \n", valor);
    }
}




