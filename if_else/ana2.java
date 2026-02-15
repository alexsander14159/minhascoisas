package if_else;

import java.util.Scanner;

public class ana2 {
    public static void main(String[] args) {
        boolean a = false;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            String numero = scanner.nextLine();
            String nome = "fim";
            if (numero.equals(nome)){
                System.out.println("Fim do programa ");
                System.exit(0);
            }
            int numero2 = Integer.parseInt(numero);
            if (numero2<0){
                System.out.println("Seu número é negativo");
            }else if (numero2>0) {
                System.out.println("Seu número é positivo");
            }else{
                System.out.println("Seu número é Zero");
            }

        }while(!a);
    }
}
