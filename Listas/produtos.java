package Listas;

import java.util.List;

public class produtos {
    static void main(String[] args) {
        List<Double> lista = List.of(29.99, 49.50, 15.75, 99.99);
        double Total= lista.stream().reduce(0.0,Double::sum);
        double imposto = Total * 0.08;
        double totalComImposto = Total + imposto;

        System.out.println("Valor total antes do imposto: " + String.format("%.2f", Total));
        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", totalComImposto));
    }
}
