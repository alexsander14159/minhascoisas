package Encapsulamento;

import java.util.ArrayList;

public class Filme {
    private String nome;
    private ArrayList<Integer> lista = new ArrayList<>();
    double soma = 0;

    public Filme(String nome) {
        this.nome = nome;
    }

    private void adicionarAvaliacao(int valor){
        lista.add(valor);
    }
    private void exibir(){
        for (int i = 0; i <lista.toArray().length ; i++) {
            soma += lista.get(i);
        }
        soma = soma/lista.toArray().length;
        System.out.printf("Média de avaliações para %s: %.2f",nome,soma);
    }

    static void main(String[] args) {
        Filme matrix = new Filme("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(1);
        matrix.exibir();
    }
}
