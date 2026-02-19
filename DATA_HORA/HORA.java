package DATA_HORA;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HORA {
    public static void main(String[] args) {
        String tarefa = "Enviar relatório semanal";
        LocalDate dataCriacao = LocalDate.of(2026,02,15);
        LocalTime horaCriacao = LocalTime.of(16,45,0);
        LocalTime horaCriacao2 = LocalTime.of(14,30,0);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm");
        String a = horaCriacao.format(formato2);
        String b = horaCriacao2.format(formato2);
        System.out.println("DATA DA CRIAÇÃO:"+ a);
        System.out.println("HORA DA CRIAÇÃO:"+b );
        Duration duracao = Duration.between(horaCriacao,horaCriacao2);
        System.out.println("Diferença"+duracao.toHours()+ duracao.toMinutesPart());



    }
}
