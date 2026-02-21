package Listas;

import java.util.List;

public class Média {
    static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
        System.out.println("A média das notas é: "+(notas.stream().reduce(0.0, Double::sum))/notas.size());
        System.out.println("A menor nota foi: "+notas.stream().min(Double::compare).get());
        System.out.println("A maior nota foi: "+notas.stream().max(Double::compare).get());
    }
}
