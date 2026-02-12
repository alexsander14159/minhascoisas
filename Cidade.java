import java.util.Scanner;
public class Cidade {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Qual o nome da sua cidade?");
        String cidade = scanner.nextLine();
        System.out.println("Qual ano estamos?");
        int ano = scanner.nextInt();
        System.out.printf("Estamos na cidade de %s, e no ano %d",cidade,ano);
    }
}