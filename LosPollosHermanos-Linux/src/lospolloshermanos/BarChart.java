/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lospolloshermanos;

/**
 *
 * @author zubaeyr
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * A simple demonstration application showing how to create a bar chart.
 */
public class BarChart extends JPanel {

    /**
     * Creates a new demo instance.
     *
     * @param title  the frame title.
     */
    ResultSet result;
    String Title=null;
    int no_of_items;
    public BarChart(String title,int no_of_items, ResultSet result) {
       // super(title);
        this.Title=title;
        this.result=result;
        this.no_of_items=no_of_items;
        if(title.equals("Categories")){
            CategoryDataset dataset = createDataset();
            JFreeChart chart = createChart(dataset);
            ChartPanel chartPanel = new ChartPanel(chart, false);
            chartPanel.setPreferredSize(new Dimension(900, 300));
            this.Title="Categories 2";
            CategoryDataset dataset2 = createDataset();
            JFreeChart chart2 = createChart(dataset2);
            ChartPanel chartPanel2 = new ChartPanel(chart2, false);
            chartPanel2.setPreferredSize(new Dimension(900, 300));
            this.setLayout(new GridLayout(2,1));
            this.add(chartPanel);
            this.add(chartPanel2);
            
        }
        else if(title.equals("Items")){
            CategoryDataset dataset = createDataset();
            JFreeChart chart = createChart(dataset);
            ChartPanel chartPanel = new ChartPanel(chart, false);
            chartPanel.setPreferredSize(new Dimension(900, 300));
            this.Title="Items 2";
            CategoryDataset dataset2 = createDataset();
            JFreeChart chart2 = createChart(dataset2);
            ChartPanel chartPanel2 = new ChartPanel(chart2, false);
            chartPanel2.setPreferredSize(new Dimension(900, 300));
            this.setLayout(new GridLayout(2,1));
            this.add(chartPanel);
            this.add(chartPanel2);
        }
        else if(title.equals("Ratings")){
            CategoryDataset dataset = createDataset();
            JFreeChart chart = createChart(dataset);
            ChartPanel chartPanel = new ChartPanel(chart, false);
            chartPanel.setPreferredSize(new Dimension(900, 300));
            this.setLayout(new GridLayout(1,1));
            this.add(chartPanel);
           
        }
      //  setContentPane(chartPanel);
        
      //  this.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        
    }

    /**
     * Returns a sample dataset.
     * 
     * @return The dataset.
     */
    private CategoryDataset createDataset() {
        
        // row keys...
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        if(Title.equals("Categories")){
            String series1 = "Category vs Quantity Sold";       
        
            for(int i=0;i<no_of_items;i++){
                try {
                    dataset.addValue(result.getInt("QtyTot"),series1,result.getString("CName"));
                    result.next();
                } catch (SQLException ex) {
                    Logger.getLogger(BarChart.class.getName()).log(Level.SEVERE, null, ex);
                }
           }   
        }
        else if(Title.equals("Categories 2")){
            String series1 = "Category vs Sub-Total";       
        
            for(int i=0;i<no_of_items;i++){
                try {
                    dataset.addValue(result.getFloat("SubTot"),series1,result.getString("CName"));
                    result.next();
                } catch (SQLException ex) {
                    Logger.getLogger(BarChart.class.getName()).log(Level.SEVERE, null, ex);
                }
           }   
        }
        else if(Title.equals("Items")){
                   try {
            String series1 = "Category vs Quantity";       
            for(int i=0;i<no_of_items-5;i++){
                result.next();
                }
            
            for(int i=0;i<5;i++){
         
                    dataset.addValue(result.getFloat("QtyTot"),series1,result.getString("MName"));
                    result.next();
                }
            } catch (SQLException ex) {
                    Logger.getLogger(BarChart.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        }
         else if(Title.equals("Items 2")){
                   try {
            String series1 = "Category vs Sub-Total";       
            for(int i=0;i<no_of_items-5;i++){
                result.next();
                }
            
            for(int i=0;i<5;i++){
         
                    dataset.addValue(result.getFloat("SubTot"),series1,result.getString("MName"));
                    result.next();
                }
            } catch (SQLException ex) {
                    Logger.getLogger(BarChart.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        }
         else if(Title.equals("Ratings")){
           try {
          
            String series1 = "Type vs Ratings";
            dataset.addValue(5.0,series1,"Maximum Scale");
            dataset.addValue(result.getFloat("FoodDrinks"),series1,"Food And Drinks");
           
            dataset.addValue(result.getFloat("CustomerService"),series1,"Customer Service");
            
            dataset.addValue(result.getFloat("StaffBehaviour"),series1,"Staff Behaviour");
            
            dataset.addValue(result.getFloat("Ambiance"),series1,"Ambiance");
           
            dataset.addValue(result.getFloat("Menu"),series1,"Menu");
          
            dataset.addValue(result.getFloat("Price"),series1,"Price");
        
           
           
            } catch (SQLException ex) {
                    Logger.getLogger(BarChart.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        try {
            result.first();
        } catch (SQLException ex) {
            Logger.getLogger(BarChart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataset;
        
    }
    
    /**
     * Creates a sample chart.
     * 
     * @param dataset  the dataset.
     * 
     * @return The chart.
     */
    private JFreeChart createChart(CategoryDataset dataset) {
        
        // create the chart...
    JFreeChart chart=null;
        if(Title.equals("Categories")){
            chart = ChartFactory.createBarChart(
            "Sales Chart for Categories vs Quantity",         // chart title
            "Categories",               // domain axis label
            "Quantity",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );
        }
              else if(Title.equals("Categories 2")){
            chart = ChartFactory.createBarChart(
            "Sales Chart for Categories Vs Total Amount",         // chart title
            "Categories",               // domain axis label
            "Sub Total",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );
        }
           else if(Title.equals("Items")){
            chart = ChartFactory.createBarChart(
            "Top 5 items vs Quantity sales ",         // chart title
            "Items",               // domain axis label
            "Quantity",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );
        }
          else if(Title.equals("Items 2")){
            chart = ChartFactory.createBarChart(
            "Top 5 items vs Quantity sales ",         // chart title
            "Items",               // domain axis label
            "Sub Total",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );
        }
         else if(Title.equals("Ratings")){
            chart = ChartFactory.createBarChart(
            "Ratings ",         // chart title
            "Type",               // domain axis label
            "Rating Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );
        }  
        

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.blue, 
            0.0f, 0.0f, new Color(0, 0, 64)
        );
        GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.green, 
            0.0f, 0.0f, new Color(0, 64, 0)
        );
        GradientPaint gp2 = new GradientPaint(
            0.0f, 0.0f, Color.red, 
            0.0f, 0.0f, new Color(64, 0, 0)
        );
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        // OPTIONAL CUSTOMISATION COMPLETED.
        
        return chart;
        
    }
    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
   

}
