package Orientação_a_Objetos;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    String descri;
    boolean concluida;

    void exibir() {
        if (concluida) {
            System.out.printf("Tarefa:%s - Status:Concluida\n",descri);
        }else{
            System.out.printf("Tarefa:%s - Status:Pendente\n",descri);
        }

    }
    public static void main(String[] args) {
        Carrinho t1 = new Carrinho();
        t1.descri = "Estudar Java";
        t1.concluida = false;

        Carrinho t2 = new Carrinho();
        t2.descri = "Fazer exercícios";
        t2.concluida = true;
        List<Carrinho> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        for (Carrinho t : lista) {
            t.exibir();
        }
    }
}