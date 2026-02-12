import java.util.Scanner;

public class TESTE {
    public static void main(String[] args) {
        int senha = 12345;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a senha?");
        int senhaNova = scanner.nextInt();
        if (senha==senhaNova) {
            System.out.println("SENHA CORRETA");
        }else{
            System.out.println("SENHA INCORRETA");
        }
    }
}
