package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthServiceTest {
    @Test
    public void ShouldSumMonthSales() {
        MonthService service = new MonthService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualMonthSum = service.sum(sales);
        int actualMonthMax = service.MaxSales(sales);
        int actualMonthMin = service.MinSales(sales);
        int actualMonthAverage = service.average(sales);
        int actualMonthAverageMin = service.averageMin(sales);
        int actualMonthAverageMax = service.averageMax(sales);
        int expectedMonthSum = 180;
        int expectedMonthMax = 8;
        int expectedMonthMin = 9;
        int expectedMonthAverage = 15;
        int expectedMonthAverageMin = 5;
        int expectedMonthAverageMax = 5;
        Assertions.assertEquals(expectedMonthSum, actualMonthSum);
        Assertions.assertEquals(expectedMonthMax, actualMonthMax);
        Assertions.assertEquals(expectedMonthMin, actualMonthMin);
        Assertions.assertEquals(expectedMonthAverage, actualMonthAverage);
        Assertions.assertEquals(expectedMonthAverageMin, actualMonthAverageMin);
        Assertions.assertEquals(expectedMonthAverageMax, actualMonthAverageMax);

    }
}
