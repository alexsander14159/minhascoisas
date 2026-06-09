package Heranca.Escola;

public class Aluno extends Pessoa implements Exibir{
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Aluno: %s - Idade: %s - Nota: %s\n",getNome(),getIdade(),nota);
    }
}
