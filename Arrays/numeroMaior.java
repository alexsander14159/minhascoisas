package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class numeroMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quais núemros você quer? Obs: deixe um espaço entre os números");
        String numeros = scanner.nextLine();
        int[] numerosUnicos = Arrays.stream(numeros.split(" "))
                .mapToInt(Integer::parseInt)
                .distinct()
                .toArray();
        int maior = numerosUnicos[0];
        int menor = numerosUnicos[0];
        for (int i = 0; i <numerosUnicos.length; i++) {
            if(maior<numerosUnicos[i]){
                maior = numerosUnicos[i];
            }
        }
        for (int i = 0; i <numerosUnicos.length; i++) {
            if(menor>numerosUnicos[i]){
                menor = numerosUnicos[i];
            }
        }
        System.out.println("Maior número:" + maior);
        System.out.println("Menor número:" + menor);
    }
}
