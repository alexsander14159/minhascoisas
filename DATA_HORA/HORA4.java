package DATA_HORA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HORA4 {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.now();
        int antecedenciaDias = 5;
        LocalDate dataLembrete = dataVencimento.minusDays(antecedenciaDias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataLembrete.format(formatter);

        System.out.println("Data do lembrete: " + dataFormatada);
    }
}
