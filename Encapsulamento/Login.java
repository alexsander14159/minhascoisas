package Encapsulamento;
import java.util.Scanner;
public class Login {
    private String login;
    private String senha;
    private String senhaNova;
    Scanner scanner = new Scanner(System.in);
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private void validarSenha(){
        int d = 2;
        for (int i = 0; i <3 ; i++) {
            System.out.println("Digite a senha:");
            senhaNova = scanner.nextLine();
            if (senhaNova.equals(senha)){
                System.out.println("Login bem-sucedido!");
                break;
            }else{
                System.out.println("Senha incorreta. Tentativas restantes: " + d);
                d = d - 1;
            }
        }
    }

    static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        Login novo1 = new Login();
        System.out.println("Login:");
        novo1.setLogin(scanner2.nextLine());
        System.out.println("Senha Correta:");
        novo1.setSenha(scanner2.nextLine());
        novo1.validarSenha();

    }
}
