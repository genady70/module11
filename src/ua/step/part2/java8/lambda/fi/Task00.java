package ua.step.part2.java8.lambda.fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Предикаты — это методы, принимающие один параметер и возвращающие значение
 * типа boolean.
 */
public class Task00
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Сумма всех элементов " + sumAll(numbers, n -> true));

        System.out.println("Сумма четных чисел " + sumAll(numbers, n -> n % 2 == 0));

        System.out.println("Сумма элементов больше трех " + sumAll(numbers, n -> n > 3));

        // FIXME напиши код используя метод sumAll который выведет сумму
        // нечетных чисел из списка
        System.out.println("Сумма нечетных чисел " + sumAll(numbers, n -> n % 2 == 1));
    }

    // универсальный метод суммирования
    public static int sumAll(List<Integer> numbers, Predicate<Integer> predicate)
    {
        int total = 0;
        for (int number : numbers)
        {
            if (predicate.test(number))
            {
                total += number;
            }
        }
        return total;
    }
}