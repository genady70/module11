package ua.step.part1.java8.lambda;

/**
 * 
 * Лямбла выражения и функциональные интерфейсы
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        // ссылка на статический метод
        Converter<String, Integer> converter = Integer::valueOf;
        int n = converter.convert("123");
        System.out.println(n);
        n = converter.convert("345");
        System.out.println(n);
    }

    @FunctionalInterface
    interface Converter<F, T>
    {
        T convert(F from);
    }
}
