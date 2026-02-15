package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class numeroMaior2 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quais núemros você quer? Obs: deixe um espaço entre os números");
    String numeros = scanner.nextLine();
    int[] numerosUnicos = Arrays.stream(numeros.split(" ")) // Corta nos espaços
                                    .mapToInt(Integer::parseInt)      // Transforma String em int
                                    .distinct()                       // Remove os repetidos!
                                    .toArray();                       // Guarda num Array final []
    // O ".getAsInt()" no final é necessário para "abrir a caixa" e pegar o número de verdade                               
    int maior = Arrays.stream(numerosUnicos).max().getAsInt();
    int menor = Arrays.stream(numerosUnicos).min().getAsInt();

    System.out.println("Maior número:" + maior);
    System.out.println("Menor número:" + menor);
    
   
   }
}
