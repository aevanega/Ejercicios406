package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Ejercicio3 {
    public static void main(String[] args) {
        String dateString = "2023-05-20";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate date = LocalDate.parse(dateString, formatter);
            System.out.println("Fecha válida: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Fecha inválida: " + dateString);
        }
    }
}
