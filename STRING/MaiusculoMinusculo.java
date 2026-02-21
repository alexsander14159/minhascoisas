package STRING;

import java.util.Scanner;

public class MaiusculoMinusculo {
    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();
        String maiusculas = texto.toUpperCase();
        String minusculas = texto.toLowerCase();

        System.out.println("Texto em maiúsculas: " + maiusculas);
        System.out.println("Texto em minúsculas: " + minusculas);
        scanner.close();
    }
}
