package kata2;

import java.util.HashMap;
import java.util.Map;


public class Histogram<T> {

    private T [] data;
    
    public Histogram(T [] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    public Map getHistogram(){
        Map<T, Integer> histogram = new HashMap<T, Integer>();
        for (T key : data) {
            if (histogram.containsKey(key)) {
                histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
                
            } else {
                histogram.put(key, 1);
            }
    }
        return histogram;
    }
}
