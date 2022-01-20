package ua.step.part1.java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Method References - передача ссылки на метод и метод forEach 
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("abc", "def", "xyz");
        // передача ссылки на метод println в метод forEach
        list.forEach(System.out::println);
        
        // передача метода print в метод forEach
        list.forEach(System.out::print);
    }
}