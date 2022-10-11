package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
          String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
           Histogram histo = new Histogram(data);
           Map<String,Integer> histogr = histo.getHistogram();

           
        for (String key : histogr.keySet()) {
            Integer value = histogr.get(key);
            System.out.println("Key " + key + ", Value = " + value);
        }
    }
}