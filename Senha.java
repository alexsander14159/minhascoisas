import java.util.Scanner;

public class Senha {
    public static void main (String[] args){
        int a = 0;
        int senha = 1234;
        int senha2;
        int b=2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite a senha:");
            senha2 = scanner.nextInt();
            if (senha2==senha){
                System.out.println("Você acessou o cofre");
            } else if (senha2!=senha) {
              System.out.printf("Senha errada\n Só resta mais %d tentaivas %n",b);
              a++;
              b--;
            }
        }while (a!=3);
        System.out.println("Acabou as tentativas código travado");
    }
}
