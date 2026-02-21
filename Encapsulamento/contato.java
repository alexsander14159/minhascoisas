package Encapsulamento;
import java.util.ArrayList;
import java.util.List;

public class contato {
    //ESSE Final ai faz que seja modificado apenas 1 vez que é pelo construtor
    private final String nome;
    private final  String numero;

    public contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }


    public static void main(String[] args) {
        ArrayList<contato> lista = new ArrayList<>();
        lista.add(new contato("João Silva", "(11) 99999-0000"));
        lista.add(new contato("Luana Santos", "(21) 98888-0000"));
        lista.add(new contato("Pedro Oliveira", "(31) 97777-0000"));
        int d = 1;
        for (int i = 0;i<=2;i++){
            d = i +1;
        System.out.printf(d+". %s - %s\n",lista.get(i).getNome(),lista.get(i).getNumero());
        }
    }
}
