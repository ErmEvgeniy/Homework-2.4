package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    @Test
    void  calculateSale() {
        StatsService itog = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = itog.calculateSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSum() {
        StatsService averageSale = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = averageSale.calculateAverageSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxSales() {
        StatsService maxSales = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = maxSales.findMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMinSales() {
        StatsService minSales = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = minSales.findMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateBelowAverageSales() {
        StatsService below = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = below.calculateBelowAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAboveAverageSales() {
        StatsService above = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = above.calculateAboveAverageSales(sales);
        assertEquals(expected, actual);
    }
}