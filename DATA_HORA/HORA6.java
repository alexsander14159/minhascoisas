package DATA_HORA;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HORA6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Digite o horário de entrada (HH:mm):");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);
        System.out.println("Digite a carga horário diária(HH:mm)");
        LocalTime hora = LocalTime.parse(scanner.next(), formatter);
        System.out.println("Digite real de saída (HH:mm):");
        LocalTime saida = LocalTime.parse(scanner.next(), formatter);
        LocalTime banco = entrada.plusHours(hora.getHour()).plusMinutes(hora.getMinute());
        LocalTime vago = saida.minusHours(banco.getHour()).minusMinutes(banco.getMinute());
        System.out.println("Horário de entrada:" + entrada);
        System.out.println("Horário de saída previsto:" + banco);
        System.out.println("Horário real de saída:" + saida);
        System.out.println("Saldo de horas:" + vago);
    }
}
