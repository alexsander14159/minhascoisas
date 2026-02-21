import java.util.Locale;
import java.util.Scanner;

public class PROJETO {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        String[][] matriz = new String[30][3];

        boolean executando =true;

        while (executando) {
            System.out.printf("====Menu====\n1.add\n2.remover\n3.atualizar\n4.sair do programa\n");

            System.out.print("Informe a opção: ");
            char opcao = scanner.nextLine().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.print("Produto: ");
                    String nome= scanner.nextLine();
                    System.out.print("Valor: ");
                    Double valor = scanner.nextDouble();
                    scanner.nextLine();
                    matriz[i][0]= nome;
                    matriz[i][1] = String.valueOf(valor);
                    i++;
                    break;
                case '4':
                    System.out.println("Encerrando programa...");
                    executando = false;
                    scanner.close();
                default:
                    System.out.println("Opção inválida");
            }

        }
    }
}
