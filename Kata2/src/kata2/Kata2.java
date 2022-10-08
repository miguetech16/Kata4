package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
          int [] data = {1, 2, 4, 3, 6, 3, 3, 1, 3, 2, 4, 6, 6, 4};
           Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
           
 
           for (int key : data) {
               if (histogram.containsKey(data[key])) {
                histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);

            } else {
                histogram.put(data[key], 1);
        }
    }
        for (Integer key : histogram.keySet()) {
            Integer value = histogram.get(key);
            System.out.println("Key " + key + ", Value = " + value);
        }
    }
}