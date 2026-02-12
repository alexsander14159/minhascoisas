package TODOS_OS_EXERCICIOS_DO_DIO;
import java.util.Scanner;
public class A1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[3];
        char[] letras = new char[3];
        for(char i = 'A';i<='C';i++){
        System.out.println("Qual o valor de " + i);
        valores[i- 'A'] = scanner.nextDouble();
        letras[i-'A'] = i;
        }
        double fim = valores[0] + valores[1];
        System.out.println("A soma de A e B é:" + fim);
        if (fim<valores[2]) {
            System.out.println("A soma de A e B é menor que C");
        }else{
            System.out.println("A soma de A e B é maior que C");
        }
        for(int d = 0;d<=2;d++){
            System.out.println("Esse é o valor de " + letras[d] + ":" + valores[d]);
        }

    }
}
