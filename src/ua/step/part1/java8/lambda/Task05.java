package ua.step.part1.java8.lambda;

/**
 * 
 * Сссылка на конструктор класса
 */
public class Task05
{
    public static void main(String[] args)
    {
        // ссылка на конструктор
        PersonFactory<Person> personFactory = Person::new;

        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person);
    }

    @FunctionalInterface
    interface PersonFactory<P extends Person>
    {
        // типы и количество параметров соотвествуют конструктору в классе Person
        P create(String firstName, String lastName);
    }

    static class Person
    {
        String firstName;
        String lastName;

        Person(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString()
        {
            return lastName + " " + firstName;
        }
    }
}
