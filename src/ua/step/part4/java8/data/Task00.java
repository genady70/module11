package ua.step.part4.java8.data;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * Основное отличие - появление нескольких новых классов в Date/Time API,
 * представляющих время, дату, временной период и временные зоны, а также -
 * классы-трансформеры.
 * 
 * Если не требуется использование временных зон, то для работы с датами
 * используется класс LocalDate, для работы со временем - класс LocalTime, и для
 * работы со временем и датами - LocalDateTime. Для работы с временными зонами
 * используется класс ZonedDateTime.
 *
 */
public class Task00
{
    public static void main(String[] args)
    {
        // Java 7
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR, 8);
        Date date = cal.getTime(); // actually returns a Date
        System.out.println(date);

        // Java 8
        LocalTime now = LocalTime.now();
        LocalTime later = now.plusHours(8);
        System.out.println(later);
    }
}