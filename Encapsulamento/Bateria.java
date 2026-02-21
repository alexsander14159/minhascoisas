package Encapsulamento;

public class Bateria {
    private int nivel;
    String nome;
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel > 0 && nivel<=100) {
            this.nivel = nivel;
        }

    }
      private void exibirAlex(){
        if (nivel<20){
            System.out.println("Bateria fraca");
        }else if(nivel>20 && nivel<80){
            System.out.println("Bateria ok");
        }else if (nivel>80){
            System.out.println("Bateria cheia");
        }
    }

    static void main(String[] args) {
        Bateria b = new Bateria();
        b.setNivel(85);
        b.exibirAlex();
    }
}