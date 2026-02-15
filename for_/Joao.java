package for_;

import java.util.Scanner;

public class Joao {
    public static void main(String[] args) {
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos produtos você vai adcionar?");
        int produtos = scanner.nextInt();
        int[] valores = new int[produtos];
        for(int i = 1;i<=produtos;i++){
            System.out.println("Me diga o valor do produto " + i);
            valores[i-1] = scanner.nextInt();
        }
        for(int i =1;i<=produtos;i++){
            soma = soma + valores[i-1];
        }
        System.out.println("A soma total das receitas é:R$" + soma );

    }
}
