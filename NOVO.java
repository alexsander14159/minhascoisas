import java.util.Scanner;

public class NOVO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // TENTATIVA (O Salto Mortal)
            System.out.println("Digite um número inteiro:");
            int numero = scanner.nextInt(); 
            System.out.println("Você digitou: " + numero);
            
        } catch (Exception e) {
            // PLANO B (A Rede de Proteção)
            // Se o usuário digitar letra, o código cai aqui!
            System.out.println("OPA! Você digitou uma letra em vez de número.");
            System.out.println("O programa não quebrou, vida que segue!");
        }
        
        System.out.println("Fim do programa.");
    }
}
