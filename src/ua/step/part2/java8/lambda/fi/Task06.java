package ua.step.part2.java8.lambda.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import ua.step.model.Employee;

/**
 * Потребители
 */
public class Task06
{
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<>();
        // Создаем метод поставщика
        PersonFactory<Employee> personFactory = Employee::new;

        Predicate<Employee> predicate = (e) -> e.getAge()<28;

        // Создаем метод потребитель
        Consumer<Employee> consumer = (p) -> System.out.println("Привет, " + p.getName());

        // Создаем объекты используюя поставщик
        Employee person = personFactory.create("Дарт Вейдер", 45);
        employees.add(person);
        Employee person2 = personFactory.create("Люк Скайвокер", 23);
        employees.add(person2);
        Employee person3 = personFactory.create("Хан Соло", 37);
        employees.add(person3);
        consume(predicate, consumer, employees);
        // FIXME исправь пример, чтобы выводились только военнообязаные
    }

    private static void consume(Predicate<Employee> predicate, Consumer<Employee> consumer, List<Employee> employees)
    {
        for (Employee employee : employees)
        {
            if (predicate.test(employee))
            {
                consumer.accept(employee); // потребление
            }
        }

    }

    @FunctionalInterface
    public interface PersonFactory<T>
    {
        Employee create(String name, int age);
    }
}
