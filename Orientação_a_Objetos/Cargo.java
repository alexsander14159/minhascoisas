package Orientação_a_Objetos;

public class Cargo {
    String nome;
    String cargo;
    int nivel;
    void exibir(String novoCargo, int novoNivel){
        System.out.println("--- Antes da atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivel + "\n");
        cargo = novoCargo;
        nivel = novoNivel;
        System.out.println("--- Após atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivel);
    }
    public static void main(String[] args) {
        Cargo novo1 = new Cargo();
        novo1.nome = "Júlia Oliveira";
        novo1.cargo = "Pessoa Desenvolvedora Júnior";
        novo1.nivel = 1;
        novo1.exibir("Pessoa Desenvolvedora Plena",2);
    }
}
