package Orientação_a_Objetos;
import java.util.ArrayList;
import java.util.List;

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
        t1.descri = "Estudar Java";
        t1.concluida = false;

        t2.descri = "Fazer exercícios";
        t2.concluida = true;
        lista.add(t1);
        lista.add(t2);
            t.exibir();
        }
    }
}