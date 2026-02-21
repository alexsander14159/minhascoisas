package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Novo {
    static void main(String[] args) {
        List<Integer> lista = List.of(2,3,5,7,11);
        List<Integer> quadrados = lista.stream().map(numeros-> numeros*numeros).collect(Collectors.toList());
        System.out.println("Quadrados dos números:"+ quadrados);

    }

}
