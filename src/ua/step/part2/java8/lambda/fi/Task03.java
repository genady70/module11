package ua.step.part2.java8.lambda.fi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import ua.step.model.Employee;

/**
 * Функции - принимают один аргумент и возвращают некоторый результат. Методы по
 * умолчанию могут использоваться для построения цепочек вызовов (compose,
 * andThen).
 */
public class Task03
{
    public static void main(String args[])
    {
        Predicate<Employee> predicate = (e)->e.getAge()>50;
        // определение функции, которая берет сотрудника и возврашает его имя
        Function<Employee, String> funcEmpToString = (Employee employee) -> employee.getName();

        // запись с помошью ссылки на метод
        // Function<Employee, String> funcEmpToString1 = Employee::getName;

        List<Employee> employeeList = Arrays.asList(
                new Employee("Tom Jones", 45), 
                new Employee("Harry Major", 25),
                new Employee("Ethan Hardy", 65), 
                new Employee("Nancy Smith", 15),
                new Employee("Deborah Sprightly", 29));
        // Преобразование списка сотрудников в список имен
        List<String> empNameList = convertEmpListToNamesList(employeeList, funcEmpToString, predicate);
        // вывод в консоль
        empNameList.forEach(System.out::println);
        // FIXME Измени пример таким образом, чтобы выводились только сотрудники
        // которым пора на пенсию
    }

    public static List<String> convertEmpListToNamesList(List<Employee> employeeList,
            Function<Employee, String> funcEmpToString, Predicate<Employee> predicat)
    {
        List<String> empNameList = new ArrayList<String>();
        for (Employee emp : employeeList)
        {
            if (predicat.test(emp)) {
                empNameList.add(funcEmpToString.apply(emp));
            }
        }
        return empNameList;
    }
}
