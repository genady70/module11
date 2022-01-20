package ua.step.part1.java8.lambda;

/**
 * 
 * Лямбда выражения и функциональные интерфейсы
 *
 */
public class Task03
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        // в переменной convert хранится ссылка на метод
        Converter<Integer, String> converter = Integer::toBinaryString;
        Converter<Integer, String> converter2 = (from) -> {
            // test(); // нельзя использовать дефолтные методы внутри лямбда
            return "";
        };
        String converted = converter.convert(255);
        System.out.println(converted);
        converter = (from) -> Integer.toHexString(from);
        converted = converter.convert(255);
        System.out.println(converted);
    }

    // не обязательная анатация для функционального интерфейса
    @FunctionalInterface
    interface Converter<F, T>
    {
        // в функциональном интерфейсе может быть объявлен только один метод
        T convert(F from);

        default void test()
        {
            System.out.println("test");
        }
    }
}