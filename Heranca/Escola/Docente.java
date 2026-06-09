package Heranca.Escola;

import TODOS_OS_EXERCICIOS_ALURA.Cidade;

public class Docente extends Pessoa implements Exibir{
    private String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }
    @Override
    public void exibirDados() {
        System.out.printf("Docente: %s - Idade: %s - Disciplina: %s\n",getNome(),getIdade(),disciplina);
    }
}
