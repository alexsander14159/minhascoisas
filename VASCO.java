import java.util.Scanner;
import java.util.Arrays;

public class VASCO {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        int[] gols=new int[3];
        for(int i = 1;i<4;i++){
        System.out.println("Quantos gols o vasco fez no jogo " + i);
        gols[i-1] = scanner.nextInt();
        }
        int soma = Arrays.stream(gols).sum();
        double media= (soma)/3;
        System.out.printf("A média de gols foi de " + media);
        if (media>2) {
            System.out.println("O ataque está excelente!");
        }else{
            System.out.println("Precisamos treinar mais finalização.");
        }
    }
    
}
