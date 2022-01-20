package ua.step.part5.java8.utils;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * Лямбда и компаратор
 *
 */
public class Task09
{
    public static void main(String[] args)
    {
        // используем Supplier (поставщик) для создание объектов класса Name
        NameFactory<Name> factory = Name::new;
        Name[] names = { 
                factory.create("Юлий", "Цезарь"),
                factory.create("Иван", "Иванов"),
                factory.create("Артем", "Иванов"),
                factory.create("Петр", "Петров"),
                factory.create("Петр", "Сидоров")
        };

        // добавление ключа сортировки испоьзуя лямбда выраженеи
        Comparator<Name> comporator = Comparator.comparing(name -> name.firstName);
        
        // добавление дополнительного ключа сортировки
       comporator = comporator.thenComparing(Name::getLastName);

        Arrays.sort(names, comporator);
        Arrays.stream(names).forEach(System.out::println);
        //FIXME измени сортировку таким образом, чтобы сначала сортировало по фамилии, а потом по имени 
    }

    static class Name
    {
        private String firstName;
        private String lastName;

        public Name(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName()
        {
            return firstName;
        }

        public String getLastName()
        {
            return lastName;
        }

        @Override
        public String toString()
        {
            return "First: " + firstName + " Last: " + lastName;
        }
    }

    @FunctionalInterface
    interface NameFactory<P extends Name>
    {
        P create(String firstName, String lastName);
    }
}