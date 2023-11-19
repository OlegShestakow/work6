package ru.netology.work6.srvices;

public class StatsService {
    public long finallyAmount(long[] sales) {
        long maxAmount = 0;

        for (int i = 0; i < sales.length; i++) {
            maxAmount = maxAmount + sales[i];

        }
        return maxAmount;
    }

    public long averageIncome(long[] sales){


        long averageAmount = 0;
        long income = finallyAmount(sales);
       long averageSales = finallyAmount(sales) / 12;
       return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long monthMinAverageSales(long[] sales) {
        int minMonth = 0;
        long averageSalesMin = averageIncome(sales);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < averageSalesMin) {
                minMonth++;
            }
        }
        return minMonth;
    }

    public long monthMaxAverageSales(long[] sales) {

        int maxMonth = 0;
        long averageSalesMax = averageIncome(sales);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > averageSalesMax) {
                maxMonth++;
            }
        }
        return maxMonth;
    }

}



