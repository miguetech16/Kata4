package kata.pkg4;

import kata.pkg4.Loaders.Loader;
import kata.pkg4.Loaders.FileLoader;
import kata.pkg4.Loaders.EmailLoader;
import java.io.File;
import kata.pkg4.histogram.Histogram;
import kata.pkg4.histogram.HistogramDisplay;

public class Kata4 {
    
    public static void main(String[] args) {
       Loader loader = new EmailLoader(new FileLoader(new File("emails.txt")));
       Histogram<String> histogram = new Histogram();
       
        for (String line : loader.load()) {
            String[] dominions = line.split("@");
            histogram.increment(dominions[1]);
        }
                
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram Display", histogram);
        histogramDisplay.execute();
    }
}
