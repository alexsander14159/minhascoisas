import java.util.Scanner;

public class DEGRAUS {
    public static void main(String[] args) {
        int d = 0;
        boolean a = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
            System.out.println("Quantos degrais você está subindo?");
            d = scanner.nextInt();
            for(int i = 1;i<=d;i++)
                System.out.println("Subindo o degrau " + i);
            System.out.println("Você chegou ao topo!");
            a=true;
            } catch (Exception e) {
                System.out.println("Você fez algo de errado tente de novo.");
                scanner.next();
            }
            
        } while (!a);
    }
}
