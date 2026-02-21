package Encapsulamento;

public class produto {
    private String nome;
    private double valor;

    public produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    private void exibir(){
        if (valor<0){
            valor = 0;
            System.out.printf("Preço inválido\nProduto: %s\nPreço:%.1f",nome,valor);
        }else{
            System.out.printf("Produto: %s\nPreço:%.1f",nome,valor);
        }
    }

    static void main(String[] args) {
        produto p1 = new produto("Mouse",-59);
        p1.exibir();
    }
}
