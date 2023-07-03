package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthServiceTest {
    @Test
    public void ShouldSumMonthSales() {
        MonthService service = new MonthService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualMonthSum = service.sum(sales);
        int expectedMonthSum = 180;
        Assertions.assertEquals(expectedMonthSum, actualMonthSum);

    }

    @Test
    public void ShouldMaxMonthSales() {
        MonthService service = new MonthService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualMonthMax = service.maxSales(sales);
        int expectedMonthMax = 8;
        Assertions.assertEquals(expectedMonthMax, actualMonthMax);

    }

    @Test
    public void ShouldMinMonthSales() {
        MonthService service = new MonthService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualMonthMin = service.minSales(sales);
        int expectedMonthMin = 9;
        Assertions.assertEquals(expectedMonthMin, actualMonthMin);

    }

    @Test
    public void ShouldAverageMonthSales() {
        MonthService service = new MonthService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualMonthAverage = service.average(sales);
        int expectedMonthAverage = 15;
        Assertions.assertEquals(expectedMonthAverage, actualMonthAverage);

    }

    @Test
    public void ShouldAverageMaxMonthSales() {
        MonthService service = new MonthService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualMonthAverageMax = service.averageMax(sales);
        int expectedMonthAverageMax = 5;
        Assertions.assertEquals(expectedMonthAverageMax, actualMonthAverageMax);

    }

    @Test
    public void ShouldAverageMinMonthSales() {
        MonthService service = new MonthService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualMonthAverageMin = service.averageMin(sales);
        int expectedMonthAverageMin = 5;
        Assertions.assertEquals(expectedMonthAverageMin, actualMonthAverageMin);


    }
}
