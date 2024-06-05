package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Convertir a ISO
        LocalDate date = LocalDate.now();
        String isoDateString = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Fecha en formato ISO: " + isoDateString);

        //  ISO a LocalDate
        LocalDate parsedDate = LocalDate.parse(isoDateString, DateTimeFormatter.ISO_DATE);
        System.out.println("Fecha parseada de formato ISO: " + parsedDate);
    }
}
