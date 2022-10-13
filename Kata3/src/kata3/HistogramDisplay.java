
package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay(String title) {
        super(title);
        setContentPane(createPanel());
        pack();
    }
    
    
    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel charPanel = new ChartPanel(createChart(createDataSet()));
        charPanel.setPreferredSize(new Dimension(500, 400));
        return charPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("Histogram..", "Dominions emails",
                                                        "Nº emails",
                                                        dataset,
                                                        PlotOrientation.VERTICAL,
                                                        false,
                                                        false,
                                                        rootPaneCheckingEnabled);
        return chart;
    }
    
    
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(2, "", "ulpgc.es");
        dataset.addValue(1, "", "dis.ulpgc.es");
        dataset.addValue(7, "", "gmail.com");
        dataset.addValue(10, "", "hotmail.com");
        dataset.addValue(15, "", "alu.ulpgc.es");
        
        return dataset;
    }
    
}
