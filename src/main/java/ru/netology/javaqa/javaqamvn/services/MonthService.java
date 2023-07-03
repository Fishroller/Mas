package ru.netology.javaqa.javaqamvn.services;

public class MonthService {
    public int sum(int[] SumSales) {
        int sumMonth = 0;
        for (int i = 0; i < SumSales.length; i++) {
            sumMonth = sumMonth + SumSales[i];
        }
        System.out.println(sumMonth);

        return sumMonth;
    }


    public int minSales(int[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        System.out.println(minMonth + 1);
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        System.out.println(maxMonth + 1);
        return maxMonth + 1;
    }

    public int average(int[] SumSales) {
        int sumMonth = 0;
        for (int i = 0; i < SumSales.length; i++) {
            sumMonth = sumMonth + SumSales[i];
        }
        int AverageSales = sumMonth / SumSales.length;
        System.out.println(AverageSales);

        return AverageSales;
    }

    public int averageMin(int[] SumSales) {
        int sumMonth = 0;
        for (int i = 0; i < SumSales.length; i++) {
            sumMonth = sumMonth + SumSales[i];
        }
        int AverageSales = sumMonth / SumSales.length;
        int lowSales = 0;
        for (int i = 0; i < SumSales.length; i++) {
            if (SumSales[i] < AverageSales) {
                lowSales++;
            }
        }
        System.out.println(lowSales);

        return lowSales;

    }

    public int averageMax(int[] SumSales) {
        int sumMonth = 0;
        for (int i = 0; i < SumSales.length; i++) {
            sumMonth = sumMonth + SumSales[i];
        }
        int AverageSales = sumMonth / SumSales.length;
        int HighSales = 0;
        for (int i = 0; i < SumSales.length; i++) {
            if (SumSales[i] > AverageSales) {
                HighSales++;
            }
        }
        System.out.println(HighSales);

        return HighSales;

    }
}