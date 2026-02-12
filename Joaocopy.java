import java.util.Scanner;
import java.util.Arrays;
public class Joaocopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos produtos você vai adcionar?");
        int produtos = scanner.nextInt();
        int[] valores = new int[produtos];
        for(int i = 1;i<=produtos;i++){
            System.out.println("Me diga o valor do produto " + i);
            valores[i-1] = scanner.nextInt();
        }
        int soma = Arrays.stream(valores).sum();
        System.out.println("A soma total das receitas é:R$" + soma );

    }
}
