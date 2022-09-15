package Kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
        private final String name;
        private final Calendar birthday;
        private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*325); 

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
        
    
    private long milliSecondsToYear(long milles) {
        return milles / MILLISECONDS_PER_YEAR;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));              
    }   
    

}
