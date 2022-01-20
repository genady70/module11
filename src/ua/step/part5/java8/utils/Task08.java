package ua.step.part5.java8.utils;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Класс Objects появился в java 1.7 но часть его методов были добавлены в 1.8
 */
public class Task08
{
    public static void main(String[] args)
    {
        Boolean bool = null;
        Predicate<Boolean> nonNull = Objects::nonNull;
        System.out.println(nonNull.test(bool));

        Predicate<Boolean> isNull = Objects::isNull;
        System.out.println(isNull.test(null));

        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));

        Predicate<String> isNotEmpty = isEmpty.negate();
        System.out.println(isNotEmpty.test("abc"));
    }
}