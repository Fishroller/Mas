package ru.netology.javaqa.javaqamvn.services;

public class MonthService {
    public int sum(int[] sumSales) {
        int sumMonth = 0;
        for (int i = 0; i < sumSales.length; i++) {
            sumMonth = sumMonth + sumSales[i];
        }

        return sumMonth;
    }


    public int minSales(int[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int average(int[] sumSales) {
        int sumMonth = sum(sumSales);
        int averageSales = sumMonth / sumSales.length;
        return averageSales;
    }

    public int averageMin(int[] sumSales) {
        int averageSales = average(sumSales);
        int lowSales = 0;
        for (int i = 0; i < sumSales.length; i++) {
            if (sumSales[i] < averageSales) {
                lowSales++;
            }
        }

        return lowSales;

    }

    public int averageMax(int[] sumSales) {
        int averageSales = average(sumSales);
        int highSales = 0;
        for (int i = 0; i < sumSales.length; i++) {
            if (sumSales[i] > averageSales) {
                highSales++;
            }
        }

        return highSales;

    }
}