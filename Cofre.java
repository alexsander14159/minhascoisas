import java.util.Scanner;

public class Cofre {
    public static void main(String[] args){
        int numero;
        int senhaErrada;
        int senha = 1234;
        Scanner scanner= new Scanner(System.in);
        System.out.println("COFRE LACRADO COM SENHA ULTRA SECRETA");
        do {
        System.out.println("Qual a senha do cofre?");
        senhaErrada= scanner.nextInt();
        if (senhaErrada==senha) {
            System.out.println("Senha correta bem vindo ao cofre");
            
        }else {
            System.out.println("Senha incorreta você quer tentar de novo?");
            System.out.println("Aperte 1 para tentar de novo e 2 para desistir");
            int certo = scanner.nextInt();
            if (certo==2) {
                System.out.println("Finalizando Programa");
                System.exit(0);
            }

        }
        
        }while (senhaErrada != senha);
    System.out.println("OPÇÕES DO CORFRE");
    System.out.println("1.FOTOS");
    System.out.println("2.VIDEOS");
    System.out.println("3.SAIR DO COFRE");
    numero=scanner.nextInt();
    do{
    if (numero==1) {

    }

    }while(numero>3);
}
}