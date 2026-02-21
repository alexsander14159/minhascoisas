package STRING;

import java.util.Scanner;

public class Espaços {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome:");
        String nome = scanner.nextLine();
        String nomeformatado = nome.trim();
        System.out.println("Nome sem espaços:"+nomeformatado );
    }
}
