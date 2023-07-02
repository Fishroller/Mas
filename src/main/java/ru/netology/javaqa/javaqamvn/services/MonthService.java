package ru.netology.javaqa.javaqamvn.services;

public class MonthService {
    public int sum(int[] SumSales) {
        int SumMonth = 0;
        for (int i = 0; i < SumSales.length; i++) {
            SumMonth = SumMonth + SumSales[i];
        }
        System.out.println(SumMonth);

        return SumMonth;
    }


    public int MinSales(int[] sales) {

        int MinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MinMonth]) {
                MinMonth = i;
            }
        }
        System.out.println(MinMonth + 1);
        return MinMonth + 1;
    }

    public int MaxSales(int[] sales) {
        int MaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        System.out.println(MaxMonth + 1);
        return MaxMonth + 1;
    }

    public int average(int[] SumSales) {
        int SumMonth = 0;
        for (int i = 0; i < SumSales.length; i++) {
            SumMonth = SumMonth + SumSales[i];
        }
        int AverageSales = SumMonth / SumSales.length;
        System.out.println(AverageSales);

        return AverageSales;
    }

    public int averageMin(int[] SumSales) {
        int SumMonth = 0;
        for (int i = 0; i < SumSales.length; i++) {
            SumMonth = SumMonth + SumSales[i];
        }
        int AverageSales = SumMonth / SumSales.length;
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
        int SumMonth = 0;
        for (int i = 0; i < SumSales.length; i++) {
            SumMonth = SumMonth + SumSales[i];
        }
        int AverageSales = SumMonth / SumSales.length;
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