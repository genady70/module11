package ua.step.part0.java8.def;

/**
 * 
 * Использование дефолтных методов в интерфейсе
 *
 */
public class Task00
{
    public static void main(String[] args)
    {
        SumSqrt mf = new SumSqrt();
        System.out.println(mf.calculate(9));
    }

    // класс реализующий интерфейс может использовать его методы расширения
    private static class SumSqrt implements Formula
    {
        @Override
        public double calculate(int a)
        {
            return sqrt(a) + sqrt(a);
        }
    }

    // это интерфейс
    private interface Formula
    {
        double calculate(int a);

        // метод по умолчанию
        default double sqrt(int a)
        {
            return Math.sqrt(a);
        }
    }
}
