package ua.step.part1.java8.lambda;

/**
 * 
 * Лямбла выражения и ссылка на метод объекта
 */
public class Task06
{
    public static void main(String[] args)
    {
        Something something = new Something();
        // ссылка на метод объекта
        Converter<String, String> converter = something::startsWith;
        String converted = converter.convert("Java");
        System.out.println(converted); // "J"
    }

    @FunctionalInterface
    interface Converter<F, T>
    {
        T convert(F from);
    }

    static class Something
    {
        private String test = " test";

        String startsWith(String s)
        {
            return String.valueOf(s.charAt(0)) + test;
        }
    }
}
