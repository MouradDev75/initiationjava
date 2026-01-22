package principal;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        /*
        Avant Java 8:
        package java.util.Date
        classes liées à la manipuation des dates en base de données
        java.sql.Date
        java.sql.Time
        java.sql.Timestamp

        A partir de Java 8, ajout du package: java.time: LocalTime, LocalDate, LocalDateTime
         */

        System.out.println("********* LocalDate:");

        LocalDate ld1 = LocalDate.now();
        System.out.println("LocalDate.now(): "+ld1);

        LocalDate ld2 = LocalDate.of(2020,11,23);
        System.out.println("LocalDate.of(): "+ld2);

        LocalDate ld3 = LocalDate.parse("2015-10-14"); //chaine sous format: année-mois-jour
        System.out.println("LocalDate.parse(): "+ld3);

        System.out.println("********** LocalDateTime:");
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("LocalDateTime.now(): "+ldt1);

        LocalDateTime ldt2 = LocalDateTime.of(2019,04,14,15,35,44);
        System.out.println("LocalDateTime.of(): "+ldt2);

        LocalDateTime ldt3 = LocalDateTime.parse("2015-11-24T15:11:55");
        System.out.println("LocalDateTime.parse(): "+ldt3);

        System.out.println("********** LocalTime:");
        LocalTime lt1 = LocalTime.now();
        System.out.println("LocalTime.now(): "+lt1);

        LocalTime lt2 = LocalTime.of(15,44,21);
        System.out.println("LocalTime.of(): "+lt2);

        LocalTime lt3 = LocalTime.parse("06:34");
        System.out.println("LocalTime.parse(): "+lt3);

        // Il existe aussi un ensemble d'enums pour les jours de la semaines, les jours du mois et es mois
        DayOfWeek dof = DayOfWeek.MONDAY;
        System.out.println("DayOfWeek: "+dof);

        Month mois = Month.APRIL;
        System.out.println("Month: "+mois);

        MonthDay md = MonthDay.of(Month.JANUARY, 22);
        System.out.println("MonthDay: "+md);

        LocalDateTime ldt = LocalDateTime.of(2015, Month.APRIL,15,11,22,45);

        ldt.minusDays(2);
        ldt.plusHours(2);
        ldt.getMinute();

        System.out.println("********** fuseau horaire:");
        ZoneId zoneId = ZoneId.of("Europe/Paris");

        //récupérer la liste des fuseaux horaires:
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("nb zone ids: "+allZoneIds.size()); //603 fuseaux horaires

        //convertir une date en fuseau horaire
        ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneId);
        System.out.println("zoned date time: "+zdt);

        System.out.println("**************** formattage de dates:");
        LocalDateTime myDate = LocalDateTime.now();

        /*
        option1: choisir un format prédéfinit dans l'enum: DateTimeFormatter
         */
        System.out.println(myDate.format(DateTimeFormatter.ISO_DATE_TIME));

        /*
        option2: choisir un format: long, moyen,court
         */
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(myDate));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(myDate));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(myDate));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(myDate));
        /*
        option3: utiliser un format personnaliser
         */

        System.out.println(myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))); //mm: pour minutes - MM: pour mois


    }
}
