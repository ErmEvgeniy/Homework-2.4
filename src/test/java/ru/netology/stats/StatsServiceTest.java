package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @org.junit.jupiter.api.Test
    void  calculateSale() {
        StatsService itog = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = itog.calculateSale(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void averageSum() {
        StatsService averageSale = new StatsService();


        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = averageSale.averageSum(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxSales() {
        StatsService maxsales = new StatsService();


        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = maxsales.maxSales(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void minSales() {
        StatsService minsales = new StatsService();


        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = minsales.minSales(sales);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void belowAverageSales() {
        StatsService below = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = below.belowAverageSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void aboveAverageSales() {
        StatsService above = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = above.aboveAverageSales(sales);
        assertEquals(expected, actual);
    }
}