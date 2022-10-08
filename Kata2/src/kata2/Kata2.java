package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
          int [] data = {1, 2, 4, 3, 6, 3, 3, 1, 3, 2, 4, 6, 6, 4};
           Map<Integer, Integer> map = new HashMap<Integer, Integer>();
           
 
           for (int i = 0; i < data.length; i++) {
               if (map.containsKey(data[i])) {
                map.put(data[i], map.get(data[i]) + 1);
            } else {
                map.put(data[i], 1);
        }
    }
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key " + key + ", Value = " + value);
        }
    }
}