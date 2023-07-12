package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the time checker");

        System.out.println("#######################################################");

        LocalDate today = LocalDate.now();

        System.out.println("actual date : " + today);

        System.out.println("#######################################################");

        String custom = today.format(DateTimeFormatter.ofPattern("eeee dd MMM"));

        System.out.println("" + custom);

        System.out.println("#######################################################");

        System.out.printf("Days since previous monday\n") ;

        LocalDate lastMonday = today.with(DayOfWeek.MONDAY).minusWeeks(1);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        for (int i = 0; i < 7; i++){

            System.out.println(lastMonday.plusDays(i).format(formatter));

        }

        System.out.println("#######################################################");


    }


}