package Orientação_a_Objetos;

public class loja {
    String nome;
    int quantidade;
    void vender(int quant){
        quantidade = quantidade - quant;
        if (quantidade>0){
            System.out.printf("Venda realizada. Estoque restante de %s:%s\n",nome,quantidade);
        }else{
            System.out.printf("Estoque insuficiente\n");
        }
    }
    public static void main(String[] args) {
        loja item = new loja();
        item.nome = "Camiseta";
        item.quantidade = 10;

        item.vender(3);
        item.vender(8);

    }
}

