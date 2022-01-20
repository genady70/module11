package ua.step.part0.java8.def;

import java.time.LocalDate;

/**
 * 
 * Использование дефолтных методов в интерфейсе
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        PeopleBirthday peopleBirthday = new People("Vitaliy", "Unguryan", 1974);
        System.out.println(peopleBirthday.getFullName());
        // использование дефолтного метода
        System.out.println(peopleBirthday.getAge());
    }

    private static class People implements PeopleBirthday
    {
        private final String firstName;
        private final String lastName;
        private final int year;

        public People(String firstName, String lastName, int year)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.year = year;
        }

        @Override
        public String getFullName()
        {
            return firstName + " " + lastName;
        }

        @Override
        public int getBirthdayYear()
        {
            return year;
        }
    }

    private interface PeopleBirthday
    {
        String getFullName();

        int getBirthdayYear();

        default int getAge()
        {
            return LocalDate.now().getYear() - getBirthdayYear();
        }
    }
}
