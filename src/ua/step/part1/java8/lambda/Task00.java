package ua.step.part1.java8.lambda;

/**
 * 
 * Лямбда выражения
 *
 */
public class Task00
{
    public static void main(String[] args)
    {
        // вызов метода doSomeWork через анонимный класс (классический способ)
        execute(new WorkerInterface()
        {
            @Override
            public void doSomeWork()
            {
                System.out.println("Worker вызван через анонимный класс");
            }
        });
        /**
         * вызов метода doSomeWork через Lambda-выражения (нововведение в Java 8)
         */
        WorkerInterface lambda = () -> System.out.println("Worker вызван через Lambda");
        execute(lambda);
    }

    // полиморфный метод
    public static void execute(WorkerInterface worker)
    {
        worker.doSomeWork();
    }
}

// определении функционального интерфейса
@FunctionalInterface
interface WorkerInterface
{
    public void doSomeWork();
}