package Encapsulamento;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    ArrayList<Double> lista = new ArrayList<>();
    ArrayList<Double> listaErrada = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    private void adicionarNota(double nota){
        if (nota<0 || nota>10){
        listaErrada.add(nota);

        }else{
            lista.add(nota);
        }
    }
    private void exibir(){
        for (int i = 0; i <listaErrada.toArray().length ; i++) {
            System.out.printf("Nota inválida ignorada: %.1f\n",listaErrada.get(i));
        }
        System.out.printf("Total de notas válidas: %s\n",lista.toArray().length);
        double soma = 0;
        for (Double nota : lista){
            soma = soma + nota;
        }
        double media = soma/lista.toArray().length;
        System.out.printf("Média em Matemática : %.2f",media);
    }

    static void main(String[] args) {
        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(-3.0);
        matematica.adicionarNota(9.5);
        matematica.exibir();
    }
}
