package Encapsulamento;
import java.util.ArrayList;
public class senha {
    private String senha;

    public senha(String senha) {
        this.senha = senha;
    }

    public void setSenha(String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            this.senha = senha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }

    static void main(String[] args) {
        senha user = new senha("123456");
        user.setSenha("1234s56", "abc123");
    }
}