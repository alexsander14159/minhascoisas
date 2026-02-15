package if_else;

import java.util.Scanner;

public class Imparoupar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me diga um número");
        double numero = scanner.nextDouble();
        double resultado = numero % 2;
        if (resultado==1) {
            System.err.println("Seu número é Impar");
        }else{
            System.err.println("Seu número é Par");
        }

}
}