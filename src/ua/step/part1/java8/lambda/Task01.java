package ua.step.part1.java8.lambda;

/**
 * 
 * Когда запускается код лямбда выражения.
 *
 */
public class Task01
{
    public static void main(String[] args)
    {
        System.out.println("Запуск программы");

        System.out.println("Перед объявлением лямбды");

        // создание потока в виде лямбда выражения
        Runnable runnable = () -> System.out.println("Я - лямбда!");

        System.out.println("После объявления лямбды");

        System.out.println("Перед передачей лямбды в тред");
        new Thread(runnable).start();
    }
}
