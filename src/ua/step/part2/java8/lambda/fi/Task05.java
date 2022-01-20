package ua.step.part2.java8.lambda.fi;

import java.util.function.Supplier;

/**
 * Поставщики
 */
public class Task05
{
    public static void main(String[] args)
    {
        Supplier<String> sup = () -> "step.ua";
        System.out.println(sup.get());
        System.out.println(sup.get());
        
        Supplier<String> emptyStrSupplier  = String::new;
        String emptyStr = emptyStrSupplier.get();
        System.out.println("String in emptyStr is->"+emptyStr+"<-");
    }
}
