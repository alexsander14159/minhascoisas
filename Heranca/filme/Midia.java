package Heranca.filme;

public class Midia {
    private String titulo;
    private int ano;
    void exibirinfo(){
        String tresPrimeiras = titulo.substring(0, 3);
        System.out.printf("LIB-%s%s",tresPrimeiras,ano);
    }
}
