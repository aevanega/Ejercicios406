package org.example;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Obtener la fecha y hora actual en diferentes zonas horarias
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        // Mostrar la fecha y hora actual en formato específico
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Hora actual en Nueva York: " + newYorkTime.format(formatter));
        System.out.println("Hora actual en Londres: " + londonTime.format(formatter));
        System.out.println("Hora actual en Tokio: " + tokyoTime.format(formatter));

        // Calcular la diferencia horaria entre Nueva York y Londres
        long hoursDifference = ChronoUnit.HOURS.between(newYorkTime, londonTime);
        System.out.println("Diferencia horaria entre Nueva York y Londres: " + hoursDifference + " horas");
    }
}
