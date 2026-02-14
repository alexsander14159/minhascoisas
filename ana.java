import java.util.Scanner;

public class ana {
    public static void main(String[] args) {
        boolean a = false;
        Scanner scanner = new Scanner(System.in);
        String nome;
        int quantidade;
        do {
            try {
            System.out.println("Digite seu nome:");
            nome = scanner.nextLine();
            // A MÁGICA: Substitui o espaço (" ") por vazio ("")
            nome = nome.replace(" ","");
            quantidade = nome.length();
            if (!nome.matches("^[a-zA-ZÀ-ÿ ]+$")){
                throw new  Exception("ERRO");
            }else if (quantidade<3){
                throw new Exception("ERRO");
            }else {
                System.out.printf("Nome %s cadastrado com sucesso", nome);
            }
            a=true;
            } catch (Exception e) {
                scanner = new Scanner(System.in);
              System.out.println("Nome inválido.");
            }
        }while (!a);
    }
}
