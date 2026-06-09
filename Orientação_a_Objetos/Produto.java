package Orientação_a_Objetos;

    String nome;
    double preco;
    int quantidade;
    void exibirInformacoes(){
        System.out.println("Produto:"+ nome);
        System.out.printf("Preço:R$%.2f %n", preco);
        System.out.println("Quantidade Em estoque: "+ quantidade);
    }
}

