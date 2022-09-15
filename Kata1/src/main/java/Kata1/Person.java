package Kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
        private final String name;
        private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
        
    public int getAge(){
        LocalDate today = LocalDate.now();
        return (int) Period.between(birthday, today).getYears(); 
    }   
    

}
