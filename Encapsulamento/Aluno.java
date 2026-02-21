package Encapsulamento;

public class Aluno {
    private String nome;
    private int pontos=0;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
    }

    private void ganharPontos(int pontos){
        this.pontos += pontos;
        atualizarNivel();
    }
    private void atualizarNivel() {
        this.nivel = (pontos / 100) + 1;
    }
    private void exibirStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Pontos: " + pontos);
        System.out.println("Nível: " + nivel);
    }

    static void main(String[] args) {
        Aluno aluno = new Aluno("Fernanda");

        aluno.ganharPontos(120);
        aluno.exibirStatus();
    }

}
