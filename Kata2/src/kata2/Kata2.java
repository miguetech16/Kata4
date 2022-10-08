package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
          Integer[] data = {1, 2, 4, 3, 6, 3, 3, 1, 3, 2, 4, 6, 6, 4};
           Histogram histo = new Histogram(data);
           Map<Integer,Integer> histogr = histo.getHistogram();

           
        for (Integer key : histogr.keySet()) {
            Integer value = histogr.get(key);
            System.out.println("Key " + key + ", Value = " + value);
        }
    }
}