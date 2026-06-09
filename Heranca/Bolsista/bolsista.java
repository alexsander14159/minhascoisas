package Heranca.Bolsista;

public class bolsista extends Aluno{


    public bolsista(String nome) {
        super(nome,"Bolsista");
    }

    @Override
    void identificar() {
        System.out.printf("Aluno: %s - Tipo: %s\n",nome,tipo);
    }
}
