package Heranca.Bolsista;

public class Main {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fernanda", "regular");
        bolsista aluno2 = new bolsista("Lucas");

        aluno1.identificar();
        aluno2.identificar();
    }
}
