package Encapsulamento;

public class carro {
    private String nome;
    private String placa;
    private int ano;

    public carro(String nome, String placa, int ano) {
        this.nome = nome;
        this.placa = placa;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public static void main(String[] args) {
        carro gol = new carro("Gol", "ABC-1234", 2020);
        System.out.printf("Veículo cadastrado:\nModelo: %s\nPlaca: %s\nAno: %d",gol.getNome(),gol.getPlaca(),gol.getAno());
    }
}