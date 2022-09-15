package Kata1;

import java.time.LocalDate;


public class Kata1 {
    
    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.parse("1949-09-24");
        
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}