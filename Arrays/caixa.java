package Arrays;
import java.util.Scanner;


public class caixa {
    public static void main(String[] args) {
        int valor;
        double[] produtos = new double[100];
        int quantidade = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("MERCADO ALEX");
        do{
        System.out.println("Qual o valor do produto?");
        produtos[quantidade] = scanner.nextDouble();
        quantidade++;
        System.out.println("Deseja colocar outro produto?");
        System.out.println("1 para sim 2 para não");
        System.out.println("3 para mostrar as compras");
        valor = scanner.nextInt();
        if (valor==2) {
            System.exit(0);
        }else if (valor==3){
            for(int i = 0; i<quantidade;i++){
                System.out.println("Produto " + i + ":" + produtos[i]);
            }
        }

        }while(valor==1);
    }
}
