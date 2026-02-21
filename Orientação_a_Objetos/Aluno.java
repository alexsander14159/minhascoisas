package Orientação_a_Objetos;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    void exibir(){
        double media = (nota1 + nota2)/2;
        System.out.printf("Aluno: %s\n",nome);
        System.out.printf("Nota1:%.1f\n",nota1);
        System.out.printf("Nota2:%.1f\n",nota2);
        System.out.printf("Média:%.1f\n",media);
        if (media<7.0){
            System.out.println("Situação:Reprovado");
        }else{
            System.out.println("Situação:Aprovado");
        }

    }
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João Silva";
        aluno1.nota1 = 6.5;
        aluno1.nota2 = 7.5;
        aluno1.exibir();
    }
}

