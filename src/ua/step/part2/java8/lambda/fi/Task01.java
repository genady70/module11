package ua.step.part2.java8.lambda.fi;

import java.util.function.Predicate;

/**
 * Интерфейс предиката содержит различные методы по умолчанию, позволяющие
 * строить сложные условия (and, or, negate).
 */
public class Task01
{
    public static void main(String[] args)
    {
        // сохранение метода на ссылку типа Предикат
        Predicate<String> predicate = (s) -> s.length() > 0;

        // использование предиката
        System.out.printf("test size: %b%n", predicate.test("foo"));
        System.out.printf("is empty: %b%n", predicate.test(""));

        // инвертирование результата предиката
        System.out.printf("test size is empty: %b%n", predicate.negate().test("")); // false

        Predicate<String> predicate2 = (s) -> s.startsWith("f");

        // объединение предикатов (условий проверки) в новый предикат
        predicate = predicate.and(predicate2);
        //predicate = predicate.or(predicate2);
        
        System.out.printf("is not empty and start f: %b%n", predicate.test("abc"));
        System.out.printf("is not empty and start f: %b%n", predicate.test("foo"));
        System.out.printf("is not empty and  start f: %b%n", predicate.test(""));
        System.out.println(predicate.test("foo"));
    }
}