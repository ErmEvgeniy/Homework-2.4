package ru.netology.stats;

public class StatsService {
    public long calculateSale(long[] sales){
        long summa = 0;
        for (long sum : sales){
            summa += sum;
        }
        return summa;
    }

    public long calculateAverageSum(long[] sales) {
        long sum = calculateSale(sales);
        return sum / sales.length;
    }

    public long findMaxSales(long[] sales){
        long month = 1;
        long maxSales = sales[0];
        for (int i = 0; i < sales.length; i++){
            if (maxSales <= sales[i]){
                month = i+1;
                maxSales= sales[i];
            }
        }
        return month;
    }

    public long findMinSales(long[] sales){
        long month = 1;
        long minSales = sales[0];
        for (int i = 0; i < sales.length; i++){
            if (minSales >= sales[i]){
                month = i+1;
                minSales= sales[i];
            }
        }
        return month;
    }

    public long calculateBelowAverageSales(long[] sales){
        long average = calculateAverageSum(sales);
        long minMonth = 0;
        for (long sum : sales){
            if (sum < average) {
                minMonth = minMonth+1;
            }
        }
        return minMonth;
    }

    public long calculateAboveAverageSales(long[] sales){
        long average = calculateAverageSum(sales);
        long maxMonth = 0;
        for (long sum : sales){
            if (sum > average) {
                maxMonth = maxMonth+1;
            }
        }
        return maxMonth;
    }
}
