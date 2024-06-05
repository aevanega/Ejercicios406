package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio1 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 10);

        long diferenciaDias = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Diferencia en días: " + diferenciaDias);

    }
}
