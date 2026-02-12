import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
   boolean alex = false;
   Scanner scanner = new Scanner(System.in);
    do {
        try {
        int número;
        System.out.println("Qual número você quer calcular o fatorial?");
        número = scanner.nextInt();
        int fatorial = 1;
        for(int i = 1;i<=número;i++){
            fatorial = i*fatorial;
        }
        System.out.println("O fatorial do seu número é " + fatorial);
        alex=true;  
        } catch (Exception e) {
            System.out.println("Fizesse algo de errado tente de novo.");
            scanner.next();
        }

        
    } while (!alex);
    }
}
