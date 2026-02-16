package TODOS_OS_EXERCICIOS_ALURA;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class Maria{
    public static void main(String[] args) {
        boolean a = false;
        int c = 0;
        ArrayList<String> lista = new ArrayList<>();
    do {
        int num = 0;
        String deTexto = JOptionPane.showInputDialog(null, "Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar):", "Lista", JOptionPane.QUESTION_MESSAGE);
        if (deTexto.equals("ver")){
            if (lista.isEmpty()){
                String nova = JOptionPane.showInputDialog(null,"Não tem ninguém na lista.\n Quer adcionar alguém(sim ou não)","Lista sem ninguém",JOptionPane.INFORMATION_MESSAGE);
                if (nova.equals("não")){
                    System.exit(0);
                }
            }else {
                JOptionPane.showMessageDialog(null, "Sua lista é essa:\n" + lista, "Ver Lista", JOptionPane.INFORMATION_MESSAGE);

            }
        }else if (deTexto.equals("sair")) {
            System.exit(0);
        }else if (deTexto!=null){
            lista.add(deTexto);
            JOptionPane.showMessageDialog(null,deTexto + " foi adciono(a).","Lista",JOptionPane.INFORMATION_MESSAGE);
            c++;
        }
    }while (!a);
    }
}
