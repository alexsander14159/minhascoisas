import java.util.Scanner;

public class Médiaescolar {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Me diz a primeira nota:");
    double nota1 = scanner.nextDouble();
    System.out.println("Me diga a segunda nota:");
    double nota2 = scanner.nextDouble();
    System.out.println("Me diga a terceira nota:");
    double nota3 = scanner.nextDouble();
    double resultado = (nota1 + nota2 + nota3)/3;
    System.out.println(resultado);
    if (resultado>=7.5) {
        System.out.println("Aprovado");
    }else{
        System.out.println("Reprovado");
    
    }
}
}