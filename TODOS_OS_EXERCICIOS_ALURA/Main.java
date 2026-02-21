package TODOS_OS_EXERCICIOS_ALURA;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        char letra;
        int numero;

        int soma = 0;
        int somaCoelho = 0;
        int somaRato = 0;
        int somaSapo = 0;

        for (int i = 0; i < N; i++) {
            numero = scanner.nextInt();
            letra = scanner.nextLine().charAt(1);
            if(letra == 'C') {
                somaCoelho += numero;
            }
            else if(letra == 'R') {
                somaRato += numero;
            }else if(letra ==  'S') {
                somaSapo += numero;
            }
            soma += numero;
        }
        System.out.printf("Total: %s cobais\n",soma);
        System.out.println("Total de coelhos: " + somaCoelho);
        System.out.println("Total de ratos: " + somaRato);
        System.out.println("Total de sapos: " + somaSapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (double)somaCoelho*100/soma);
        System.out.printf("Percentual de ratos: %.2f %%\n ", (double)somaRato*100/soma);
        System.out.printf("Percentual de sapos: %.2f %%\n", (double)somaSapo*100/soma);
        scanner.close();


    }
}
