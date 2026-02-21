package Orientação_a_Objetos;

import java.util.ArrayList;
import java.util.List;

public class mercado {
    String nome;
    double preco;
    int quantidade;
    double metodo(){
        return preco * quantidade;
    }
    public static void main(String[] args) {
        double soma = 0;
        mercado i1 = new mercado();
        i1.nome = "Teclado";
        i1.preco = 120.0;
        i1.quantidade = 1;
        mercado i2 = new mercado();
        i2.nome = "Mouse";
        i2.preco = 60.0;
        i2.quantidade = 2;
        List<mercado> lista = new ArrayList<>();
        lista.add(i1);
        lista.add(i2);
        for (mercado t : lista){
            soma = t.metodo() + soma;
        }
        System.out.printf("Total da compra: %.1f",soma);
    }
    }

