package Heranca.Bolsista;

public class Aluno {
    protected String nome;
    protected String tipo;

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    void identificar(){
        System.out.printf("Aluno: %s - Tipo: %s\n",nome,tipo);
    }
}
