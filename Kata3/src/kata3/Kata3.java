package kata3;


public class Kata3 {

   
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("gamil.com");
        histogram.increment("gamil.com");   
        
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram Display", histogram);
        histogramDisplay.execute();
    }
    
}
