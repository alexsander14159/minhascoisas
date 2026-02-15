package Arrays;

import java.util.Scanner;

public class soma2 {
    public static void main(String[] args) {
        boolean alex = false;
        Scanner scanner = new Scanner(System.in);
        int alexs; 
        int soma;
        
        do {
            try {
            
                alexs = 0;
                soma = 0;

                int[] intervalo = new int[2];
                System.out.println("Você quer somar os números em qual intervalo?");
                System.out.println("De:");
                intervalo[0] = scanner.nextInt();
                System.out.println("Até:");
                intervalo[1] = scanner.nextInt();
                
                int meio = (intervalo[1] - intervalo[0]) + 1;
                int[] numeros = new int[meio];
                
                for(int i = intervalo[0]; i <= intervalo[1]; i++){
                    numeros[alexs] = i;
                    alexs++;
                }
                
                System.out.println("Você quer somar quais números?\n1.Números pares\n2.Números Impares\n3.Todos os números");
                int d = scanner.nextInt();

                
                if (d == 1 && (numeros[0] % 2) == 0) {
                    for (int i = numeros[0]; i <= intervalo[1]; i = i + 2) {
                        soma = soma + i;
                    }
                } 
                else if (d == 1 && (numeros[0] % 2) == 1) { 
                    for (int i = numeros[0] + 1; i <= intervalo[1]; i = i + 2) {
                        soma = soma + i;
                    }
                } 
                else if (d == 2 && (numeros[0] % 2) == 0) { 
                    for (int i = numeros[0] + 1; i <= intervalo[1]; i = i + 2) {
                        soma = soma + i;
                    }
                } 
                else if (d == 2 && (numeros[0] % 2) == 1) { 
                    for (int i = numeros[0]; i <= intervalo[1]; i = i + 2) {
                        soma = soma + i;
                    }
                } 
                else { 
                    
                    for (int i = numeros[0]; i <= intervalo[1]; i++) {
                        soma = soma + i;
                    }
                }
                
                System.out.println("Resultado: " + soma);
                alex = true;
                
            } catch (Exception e) {
                System.out.println("Você fez alguma coisa de errado");
                scanner.next(); 
            }
        } while (!alex);
    }
}
