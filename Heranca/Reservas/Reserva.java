package Heranca.Reservas;

import java.util.Scanner;

public class Reserva {
    public void reservar(){
        System.out.println("Reserva realizada");
    }
    public void reservar(String data){
        System.out.printf("Reserva feita para o dia [%s]\n", data);
    }
    public void reservar(String data, int pessoas){
        System.out.printf("Reserva feita para o dia [%s] para [%s] pessoas\n", data, pessoas);
    }

}
