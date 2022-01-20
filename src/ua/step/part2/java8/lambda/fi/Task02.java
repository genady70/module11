package ua.step.part2.java8.lambda.fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * Использование предиката (условия)
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // суммирут все числа
        System.out.println(sumAll(numbers, n -> true));

        // суммирут только неченые числа
        System.out.println(sumAll(numbers, n -> n % 2 == 0));

        // суммирут все числа которые больше трех
        System.out.println(sumAll(numbers, n -> n > 3));
        
        //FIXME выведи сумму чисел которые делятся на 3 без остатка 
        System.out.println(sumAll(numbers, n -> n % 3 == 0));
    }

    public static int sumAll(List<Integer> numbers, Predicate<Integer> p)
    {
        int total = 0;
        for (int number : numbers)
        {
            if (p.test(number))
            {
                total += number;
            }
        }
        return total;
    }
}
