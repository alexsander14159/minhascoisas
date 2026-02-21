package Orientação_a_Objetos;

import java.util.Scanner;

public class Livro {
    String nome;
    String autor;
    int paginas;
    void exibir(){
        System.out.printf("%s de %s com %d páginas",nome,autor,paginas);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro1 = new Livro();
        System.out.println("Qual o nome do livro?");
        livro1.nome = scanner.nextLine();
        System.out.println("Qual o nome do autor?");
        livro1.autor = scanner.next();
        System.out.println("Quantas páginas tem o livro?");
        livro1.paginas = scanner.nextInt();
        livro1.exibir();
    }
}
