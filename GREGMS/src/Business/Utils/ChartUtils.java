/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import Business.EnergyProvider.EnergyData;
import Business.EnergyProvider.EnergyDataCatalog;
import Business.EnergyProvider.EnergyProducer;
import Business.EnergyProvider.EnergyProducerCatalog;
import java.awt.Font;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Mukul
 */
public class ChartUtils {
    
    public static ChartPanel createLineChartPanel(List<EnergyData> forecastedData) {
        // Create the dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Add the forecasted data to the dataset
        for (EnergyData data : forecastedData) {
            // Use the date as the category and the energy output as the value
            dataset.addValue(data.getEnergyOutput(), "Energy Output", data.getTimestamp().toString());
        }

        // Create the chart
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Energy Production Forecast",
                "Date", "Energy Output",
                dataset, PlotOrientation.VERTICAL,
                true, true, false);

        // Wrap the chart in a ChartPanel
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

        return chartPanel;
    }
    
    public static ChartPanel createEnergySourcePieChart(EnergyProducerCatalog energyProducersCatalog) {
        // Create a dataset
        DefaultPieDataset dataset = new DefaultPieDataset();

        // Aggregate data from all producers
        Map<String, Double> sourceTotals = new HashMap<>();
        List<EnergyProducer> energyProducers = energyProducersCatalog.getAllProducers();
        for (EnergyProducer producer : energyProducers) {
            EnergyDataCatalog energyDataCatalog = producer.getEdc();
            for (EnergyData data : energyDataCatalog.getEnergyDataList()) {
                String source = data.getSourceOfEnergy();
                double quantity = data.getEnergyOutput();
                sourceTotals.merge(source, quantity, Double::sum);
            }
        }

        // Populate the dataset
        for (Map.Entry<String, Double> entry : sourceTotals.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }

        // Create a chart
        JFreeChart chart = ChartFactory.createPieChart(
                "Energy Production by Source", // Chart title
                dataset, // Dataset
                true, // Include legend
                true,
                false);

        // Customize the chart
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionOutlinesVisible(false);
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(true);
        plot.setLabelGap(0.02);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(370, 370));  // You can adjust the size
        
        return chartPanel;
    }
    
    
    
    public static ChartPanel createEnergySourceChart(List<Transaction> transactions) {
        // Create dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        Map<String, Double> energySourceMap = new HashMap<>();
        for (Transaction transaction : transactions) {
            String source = transaction.getEnergySource();
            Double energy = energySourceMap.getOrDefault(source, 0.0);
            energySourceMap.put(source, energy + transaction.getAmountSold());
        }
        for (Map.Entry<String, Double> entry : energySourceMap.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }
        
        // Create chart
        JFreeChart chart = ChartFactory.createPieChart(
            "Procured Energy by Source",  // chart title
            dataset,                      // dataset
            true,                         // include legend
            true,
            false);

        // Create ChartPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(370, 370));  // You can adjust the size
        
        return chartPanel;
    }
    
    public static JFreeChart createLineChart(Map<LocalDate, Double> forecastData) {
        // Sort the map by date to ensure the line chart follows the date order
        Map<LocalDate, Double> sortedForecastData = new TreeMap<>(forecastData);

        // Create a dataset for the chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Fill the dataset with values from the forecast data
        for (Map.Entry<LocalDate, Double> entry : sortedForecastData.entrySet()) {
            LocalDate date = entry.getKey();
            Double value = entry.getValue();
            dataset.addValue(value, "Energy Consumption", date.toString());
        }

        // Create the line chart using the dataset
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Energy Consumption Forecast", // Chart title
                "Date",                        // X-Axis label
                "Predicted Consumption (MWh)", // Y-Axis label
                dataset,
                PlotOrientation.VERTICAL,
                true,  // Include legend
                true,  // Tooltips
                false  // URLs
        );

        return lineChart;
    }
    
    public static JFreeChart createPieChart(Map<String, Double> data) {
    DefaultPieDataset dataset = new DefaultPieDataset();

    for (Map.Entry<String, Double> entry : data.entrySet()) {
        dataset.setValue(entry.getKey(), entry.getValue());
    }

    JFreeChart chart = ChartFactory.createPieChart(
        "Energy Source vs Total Amount Sold", // chart title
        dataset,                             // data
        true,                                // include legend
        true,
        false);

    return chart;
}
}
