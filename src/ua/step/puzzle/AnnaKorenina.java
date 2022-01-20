package ua.step.puzzle;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.youtube.com/watch?v=6bN1HcRhse4
 *
 */
public class AnnaKorenina
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Вронский",null, "Анна");
        Comparator<String> comp = Comparator.nullsLast(Comparator.naturalOrder());
        
        System.out.println(Collections.max(list, comp));
        System.out.println(list.stream().collect(Collectors.maxBy(comp)).get());
    }
}