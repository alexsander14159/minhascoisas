import java.util.Scanner;

public class PEDIDO {
    public static void main(String[] args) {
        boolean alex = false;
        Scanner scanner = new Scanner(System.in);
        double distancia;
        boolean chuva;
        double taxa = 0;

        do {
            try {
        System.out.println("Quantos km vai percorrer?");
        distancia = scanner.nextInt();
        System.out.println("Está chovendo?");
        chuva = scanner.nextBoolean();
        if (chuva==true) {
            taxa= 2;
        }
        if (distancia<=5) {
            System.out.println("Você deve pagar R$5,00");
        }else if (distancia>5 & distancia<10){
            System.out.println("Você deve pagar R$8,00");
        }else{
            System.out.println("Você deve pagar R$10,00 mais taxa de R$" + taxa);
            alex=true;
        }
        
            } catch (Exception e) {
                System.out.println("Fizesse alguma coisa de errado");
                scanner.next();
            }   
        } while (!alex);
    }
}

    