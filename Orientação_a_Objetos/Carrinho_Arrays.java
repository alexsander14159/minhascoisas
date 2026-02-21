package Orientação_a_Objetos;
import java.util.ArrayList;
import java.util.List;

public class Carrinho_Arrays {
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
        Carrinho_Arrays t1 = new Carrinho_Arrays();
        t1.descri = "Estudar Java";
        t1.concluida = false;

        Carrinho_Arrays t2 = new Carrinho_Arrays();
        t2.descri = "Fazer exercícios";
        t2.concluida = true;
        List<Carrinho_Arrays> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        for (Carrinho_Arrays t : lista) {
            t.exibir();
        }
    }
}