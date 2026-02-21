package Orientação_a_Objetos;

public class multa {
    String nome;
    int diaAtraso;

    void exibir() {
        double valor = diaAtraso * 2.5;
        if (diaAtraso > 0) {
            System.out.printf("Livro: %s | Multa por %s de atraso: R$%.1f",nome,diaAtraso,valor);
        }else{
            System.out.printf("Livro: %s | Sem Multa de atraso");
        }
    }
    public static void main(String[] args) {
        multa pedido = new multa();
        pedido.nome = "Dom Casmurro";
        pedido.diaAtraso = 3;

        pedido.exibir();
    }
}