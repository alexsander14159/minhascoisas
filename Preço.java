import java.util.Scanner;

public class Preço {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o preço do produto?");
        double valor = scanner.nextDouble();
        if (valor<=50) {
            System.out.println("Categoria do produto: Econômico");
        }else if (50<valor && valor<=200){
            System.out.println("Categoria do produto: Intermédiario");

        }else{
            System.out.println("Categoria do produto: Premium");
        }
    }
    
}