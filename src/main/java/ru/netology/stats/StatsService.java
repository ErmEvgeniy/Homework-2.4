package ru.netology.stats;

public class StatsService {


    public long calculateSale(long[] sales){

        long summa = 0;
        for (long sum : sales) {
            summa += sum;
        }
        return summa;
    }



    public long averageSum(long[] sales){

        long average = 0;
        for (long sum : sales){
            average += sum;
        }
        return (long) average/12;
    }



    public long maxSales(long[] sales){

        long month = 1;
        long s = sales[0];
        for (int i = 0; i < 12; i++){
            if (s <= sales[i]){
                month = i+1;
                s= sales[i];
            }
        }
        return month;
    }



    public long minSales(long[] sales){

        long month = 1;
        long s = sales[0];
        for (int i = 0; i < 12; i++){
            if (s >= sales[i]){
                month = i+1;
                s= sales[i];
            }
        }
        return month;
    }




    public long belowAverageSales(long[] sales){

        StatsService averageOfYear = new StatsService();
        long average = averageOfYear.averageSum(sales);
        long minMonth = 0;
        for (long sum : sales){
            if (sum < average) {
                minMonth = minMonth+1;
            }
        }
        return minMonth;
    }


    public long aboveAverageSales(long[] sales){

        StatsService averageOfYear = new StatsService();
        long average = averageOfYear.averageSum(sales);
        long maxMonth = 0;
        for (long sum : sales){
            if (sum > average) {
                maxMonth = maxMonth+1;
            }
        }
        return maxMonth;
    }
}
