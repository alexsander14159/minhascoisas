import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean alex = false;
        double[] lados = new double[3];
        do {
           try {
            System.out.println("Calculadora de triângulos");
            for(char i = 'A';i<='C';i++){
                System.out.println("Me diga o valor do lado " + i);
                lados[i-'A'] = scanner.nextDouble();
            }
            if (lados[0]+lados[1]>lados[2] && lados[0]+lados[2]>lados[1] && lados[1]+lados[2]>lados[0]) {
                System.out.println("Esse triângulo existe");
            }else{
                System.out.println("Esse triângulo não existe");
            }
            alex=true;
           } catch (Exception e) {
            System.out.println("Fizesse algo de errado");
            scanner.next();
           } 
        } while (!alex);
    }
}
