package ua.step.part2.java8.lambda.fi;

import java.util.Optional;

/**
 * Опциональные значения или прощай NullPointerException
 */
public class Task07
{
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        
        // небезопасный метод
       // System.out.println(getStreet(employee));

        // безопасный метод на основе опциональных значений
        System.out.println(getSafetyStreet(employee));
        // FIXME закоментируйте метод getStreet чтобы убедится, что безопасый
        // метод справляется с возложенной на него задачей
    }

    /**
     * Данный метод не безопасен, так как вызовы методов getPerson(),
     * getAddress() могут вернуть null, что вызовет NullPointerException
     */
    private static String getStreet(Employee employee)
    {
        return employee.getPerson().getAddress().getStreet();
    }

    private static String getSafetyStreet(Employee employee)
    {
        return Optional.ofNullable(employee).
                map(Employee::getPerson).
                map(Person::getAddress).
                map(Address::getStreet)
                .orElse("<неизвестно>");
    }
}

class Employee
{
    private Person person;

    public Person getPerson()
    {
        return person;
    }
}

class Person
{
    private Address address;

    public Address getAddress()
    {
        return address;
    }
}

class Address
{
    private String street;

    String getStreet()
    {
        return street;
    }
}
