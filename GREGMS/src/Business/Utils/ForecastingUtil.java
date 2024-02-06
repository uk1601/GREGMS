/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import Business.EnergyProvider.EnergyData;
import Business.GridOperator.ConsumerTransaction;
import org.apache.commons.math3.stat.regression.SimpleRegression;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class ForecastingUtil {
    
    // Method to perform linear regression and forecast future production
    public static List<EnergyData> forecastProduction(List<EnergyData> historicalData, LocalDate startDate, LocalDate endDate, UUID producerId, String defaultLocation, String defaultSource) { {
        // Initialize regression object
        SimpleRegression regression = new SimpleRegression();
        
        // Add historical data to regression model
        for (EnergyData data : historicalData) {
            LocalDate date = data.getTimestamp().toLocalDate();
            long x = ChronoUnit.DAYS.between(startDate, date); // x represents the number of days since the start date
            double y = data.getEnergyOutput(); // y is the energy production value
            System.out.println("Adding data to regression model: x = " + x + ", y = " + y);
            regression.addData(x, y);
        }
        
        // Forecast future production
        List<EnergyData> forecastedData = new ArrayList<>();
        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            long x = ChronoUnit.DAYS.between(startDate, date);
            double predictedProduction = regression.predict(x);
            EnergyData predictedData = new EnergyData(
            producerId,                      // Assuming you're forecasting for a single producer
            LocalDateTime.of(date, LocalTime.MIDNIGHT), // Combine LocalDate with a time to create a LocalDateTime
            predictedProduction,             // Predicted energy output from the regression model
            defaultSource,                   // Default or estimated source of energy
            defaultLocation,                 // Default or most common location
            "Forecasted data"                // Comments indicating this is forecasted data
        );
            forecastedData.add(predictedData);
        }
        
        return forecastedData;
    }
    
    }
    
    public static Map<LocalDate, Double> forecastConsumerDemand(List<ConsumerTransaction> transactions, UUID consumerId, LocalDate startDate, LocalDate endDate) {
    SimpleRegression regression = new SimpleRegression();
    Map<LocalDate, Double> forecastMap = new HashMap<>();

    // Filter transactions for the given consumerId
    List<ConsumerTransaction> filteredTransactions = filterTransactionsByConsumer(transactions, consumerId);

    if (filteredTransactions.isEmpty()) {
        System.out.println("No transactions found for consumer ID: " + consumerId);
        return forecastMap;
    }

    // Add transaction data to the regression model
    for (ConsumerTransaction transaction : filteredTransactions) {
        LocalDate transactionDate = transaction.getDate().toLocalDate();
        System.out.println("Adding data to regression model: x = " + startDate + ", y = " + transactionDate);
        long x = ChronoUnit.DAYS.between(startDate, transactionDate);
        
        double y = transaction.getQuantityOfEnergy();
        
        // Log the values to check if they make sense
        System.out.println("Adding data to regression model: x = " + x + ", y = " + y);

        regression.addData(x, y);
    }

    if (regression.getN() < 2) {
        System.out.println("Not enough data points to create a regression model.");
        return forecastMap;
    }

    long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
    
    // Log the slope and intercept to see if they are computed correctly
    System.out.println("Regression slope: " + regression.getSlope());
    System.out.println("Regression intercept: " + regression.getIntercept());

    for (long i = 0; i <= daysBetween; i++) {
        LocalDate forecastDate = startDate.plusDays(i);
        double predictedAmount = regression.predict(i);

        // Log the predicted amount to check for NaN values
        System.out.println("Forecast for " + forecastDate + ": " + predictedAmount);

        if (!Double.isNaN(predictedAmount)) {
            forecastMap.put(forecastDate, predictedAmount);
        } else {
            System.out.println("Predicted amount is NaN for date: " + forecastDate);
        }
    }

    return forecastMap;
}
    
     private static List<ConsumerTransaction> filterTransactionsByConsumer(List<ConsumerTransaction> transactions, UUID consumerId) {
        List<ConsumerTransaction> filteredTransactions = new ArrayList<>();

        for (ConsumerTransaction transaction : transactions) {
            if (transaction.getConsumerId().equals(consumerId)) {
                filteredTransactions.add(transaction);
            }
        }

        return filteredTransactions;
    }
     
     
    public static Map<LocalDate, Double> forecastAllConsumerDemand(List<ConsumerTransaction> transactions, LocalDate startDate, LocalDate endDate) {
    SimpleRegression regression = new SimpleRegression();
    Map<LocalDate, Double> forecastMap = new HashMap<>();

    // Filter transactions for the given consumerId

    
    // Add transaction data to the regression model
    for (ConsumerTransaction transaction : transactions) {
        LocalDate transactionDate = transaction.getDate().toLocalDate();
        System.out.println("Adding data to regression model: x = " + startDate + ", y = " + transactionDate);
        long x = ChronoUnit.DAYS.between(startDate, transactionDate);
        
        double y = transaction.getQuantityOfEnergy();
        
        // Log the values to check if they make sense
        System.out.println("Adding data to regression model: x = " + x + ", y = " + y);

        regression.addData(x, y);
    }

    if (regression.getN() < 2) {
        System.out.println("Not enough data points to create a regression model.");
        return forecastMap;
    }

    long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
    
    // Log the slope and intercept to see if they are computed correctly
    System.out.println("Regression slope: " + regression.getSlope());
    System.out.println("Regression intercept: " + regression.getIntercept());

    for (long i = 0; i <= daysBetween; i++) {
        LocalDate forecastDate = startDate.plusDays(i);
        double predictedAmount = regression.predict(i);

        // Log the predicted amount to check for NaN values
        System.out.println("Forecast for " + forecastDate + ": " + predictedAmount);

        if (!Double.isNaN(predictedAmount)) {
            forecastMap.put(forecastDate, predictedAmount);
        } else {
            System.out.println("Predicted amount is NaN for date: " + forecastDate);
        }
    }

    return forecastMap;
}

}
