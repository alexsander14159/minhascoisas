package Orientação_a_Objetos;

public class Temperatura {
    String local;
    double calor;

    void exibir() {
        System.out.printf("Sensor no Local:%s\n",local);
        if (calor > 37.5) {
            System.out.printf("Temperatura: %.1f °C\n", calor);
            System.out.println("Alerta: Temperatura acima do limite!");
        } else {
            System.out.printf("Temperatura: %.1f °C", calor);
        }
    }

    public static void main(String[] args) {
        Temperatura nova1 = new Temperatura();
        nova1.calor = 39.2;
        nova1.local = "Setor A";
        nova1.exibir();
    }
}


