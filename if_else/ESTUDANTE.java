package if_else;

import java.util.Scanner;

public class ESTUDANTE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a = false;
        do {
            try {
                System.out.println("Você tem quantos anos?");
                int idade = scanner.nextInt();  
                System.out.println("Você é estudante?");
                String estudante = scanner.next();
                if (idade<18 || estudante.equals("sim") ) {
                    System.out.println("Você paga meia");
                } else{
                    System.out.println("Você paga inteira");
                }
            } catch (Exception e) {
                System.out.println("Você colocou letras ou números decimais, tente de novo.");
                scanner.next();
                a= true;
             }  
        } while (a!=false);
        
    }
}