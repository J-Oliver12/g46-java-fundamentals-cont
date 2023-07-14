package org.example;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        exerciseOneToFour();
        exercisesCont();
        exercisesCont2();
        extraAssign();




    }

        public static void exerciseOneToFour(){

            System.out.println("Welcome to the time checker");

            System.out.println("\n########################## 1 ############################");

            LocalDate today = LocalDate.now();
            System.out.println("\nActual date : " + today);

            System.out.println("\n########################## 2 ############################");

            String custom = today.format(DateTimeFormatter.ofPattern("eeee dd MMM"));
            System.out.println("\nToday is : " + custom);

            System.out.println("\n########################## 3 #############################");

            System.out.println("\nDays since previous monday :\n");
            LocalDate lastMonday = today.with(DayOfWeek.MONDAY).minusWeeks(1);
            DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
            for (int i = 0; i < 7; i++){
                System.out.println(lastMonday.plusDays(i).format(formatter));
            }

            System.out.println("\n########################## 4 #############################");

            String courseContinues = "2023-07-31";
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(courseContinues,formatter1);
            System.out.println("\nParsed LocalDate: " + date);


        }


        public static void exercisesCont() {


            System.out.println("\n########################## 5 #############################");

            LocalDate exerciseFive = LocalDate.of(1945, 5, 8);
            DayOfWeek day = exerciseFive.getDayOfWeek();
            System.out.println("\nThe day of week at 1945-05-08 was: " + day);


            System.out.println("\n########################## 6 #############################");

            LocalDate today = LocalDate.now();
            LocalDate calc = today.plusYears(10).minusMonths(10);
            Month when = calc.getMonth();
            System.out.println("\nThe Date 10 years in the future from today minus 10 months is: " + calc);
            System.out.println("\nThe month at this date is: " + when);

            System.out.println("\n########################## 7 #############################\n");

            LocalDate birthDate = LocalDate.parse("1983-12-12");
            LocalDate exerciseFiver = LocalDate.parse("2032-09-13");
            Period period = Period.between(birthDate, exerciseFiver);
            int years = period.getYears();
            int months = period.getMonths();
            int days = period.getDays();
            System.out.println("In 2032-09-13 I will be: " + years + " years, " + months + " months, " + days + " days.");

            System.out.println("\n########################## 8 #############################\n");

            Period periodOf = Period.of(4, 7, 29);
            LocalDate current = LocalDate.now();
            LocalDate periodEqual = current.plus(periodOf);
            System.out.println("The date in 4 years 7 months and 29 days will be : \n" + periodEqual);


            System.out.println("\n########################## 9 #############################\n");

            LocalTime currentTime = LocalTime.now();
            System.out.println("Current time is: " + currentTime.truncatedTo(ChronoUnit.SECONDS));


            System.out.println("\n########################## 10 ############################\n");


            int nano = LocalTime.now().getNano();

            System.out.println("Current time with nanoseconds is: " + currentTime.truncatedTo(ChronoUnit.NANOS));
            System.out.println("\nThe nano seconds at this point are: " + nano);


            System.out.println("\n########################## 11 ############################\n");

            String time = "11:11:11";
            LocalTime string = LocalTime.parse(time);
            System.out.println("Local time from string is: " + string);
        }



    public static void exercisesCont2() {


        System.out.println("\n########################## 12 ############################\n");

        LocalTime current11 = LocalTime.now();

        String custom = current11.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println("The time is : " +custom);


        System.out.println("\n########################## 13 ############################\n");

        LocalDateTime date = LocalDateTime.of(2018,04,05,10,00);

        System.out.println("The requested date & time is: \n");

        System.out.println(date);

        System.out.println("\n########################## 14 ############################\n");


        String time2 = "2023-07-14T11:11";

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("eeee dd MMM HH:mm");

        LocalDateTime date2 = LocalDateTime.parse(time2);

        String formattedDate = formatter2.format(date2);

        System.out.println("Formatted Date: " + formattedDate);


        System.out.println("\n########################## 15 ############################\n");

        LocalDate localD = LocalDate.parse("2023-07-14");

        LocalTime localT = LocalTime.parse("18:30");

        LocalDateTime datetime3 = LocalDateTime.of(localD,localT);

        System.out.println("The format combination of Date and time is shown as: " +datetime3);


        System.out.println("\n########################## 16 ############################\n");

        LocalDateTime testing2 = LocalDateTime.now();

        LocalDate date22 = testing2.toLocalDate();

        LocalTime time22 = testing2.toLocalTime();

        System.out.println("Date: \n" +date22);

        System.out.println("\nTime: \n" +time22.truncatedTo(ChronoUnit.SECONDS));



        System.out.println("\n########################## 17 ############################\n");







    }


    public static void extraAssign(){


        LocalDate calender = LocalDate.of(2018,01,01);
        DateTimeFormatter formatter1 = DateTimeFormatter.ISO_DATE;

        System.out.println("Here is a rolling calender for the Year 2018 \n");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                LocalDate currentDate = calender.plusMonths(i).plusDays(j);

                System.out.println("\nYear-Month-Day :");

                System.out.println(currentDate.format(formatter1));
            }
        }
        System.out.println("\n##########################################################\n");
    }


















}

