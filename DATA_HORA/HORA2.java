package DATA_HORA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HORA2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate data = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd|MM|yyyy");
        System.out.printf("Data de inicio da compra hoje:\n %s ", data.format(formatador)+"\n");
        System.out.println("Quantos dias de prazo?");
        int prazo = scanner.nextInt();
        LocalDate dataEntega = data.plusDays(prazo);
        System.out.printf("Data do encerramento do prazo:\n %s ", dataEntega.format(formatador)+"\n");

    }
}
