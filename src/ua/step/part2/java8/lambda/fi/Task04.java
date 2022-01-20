package ua.step.part2.java8.lambda.fi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import ua.step.model.Employee;

/**
 * Функции - использование методов объеденения функций в цепочку.
 */
public class Task04
{
    public static void main(String args[])
    {
        Function<Employee, String> funcEmpToString = (Employee e) -> e.getName();
        Function<String, String> initialFunction = (String s) -> s.substring(0, 1)+"."+s.substring(s.indexOf(" ")+1,s.indexOf(" ")+2)+".";
        Function<Employee, String> unionFunction = funcEmpToString.andThen(initialFunction);

        
        // FIXME используя объеденения методов в цепочку, выведи инициалы в виде T.J.
        // Нельзя изменять код ниже
        List<Employee> employeeList = Arrays.asList(
                new Employee("Tom Jones", 45), 
                new Employee("Harry Major", 25),
                new Employee("Ethan Hardy", 65), 
                new Employee("Nancy Smith", 15),
                new Employee("Deborah Sprightly", 29));
        
        // объединям функции образуя цепочку функций
       
        List<String> empNameListInitials = convertEmpListToNamesList(employeeList, unionFunction);
        empNameListInitials.forEach(System.out::println);
    }

    public static List<String> convertEmpListToNamesList(List<Employee> employeeList,
            Function<Employee, String> funcEmpToString)
    {
        List<String> empNameList = new ArrayList<String>();
        for (Employee emp : employeeList)
        {
            empNameList.add(funcEmpToString.apply(emp));
        }
        return empNameList;
    }
}
