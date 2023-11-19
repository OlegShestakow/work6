package ru.netology.work6.srvices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class StatsServiceTest {
    @Test
    public void maxAmountOfSales() {
        StatsService service = new StatsService();
        long[] sales = {12, 3, 14, 6, 8, 34, 7, 13, 25, 20, 23, 30};
        System.out.println("Сумма всех продаж за год составила " + service.finallyAmount(sales) + " Rub ");
    }

    @Test
    public void averageIncomeOfSales() {
        StatsService service = new StatsService();
        long[] sales = {12, 3, 14, 6, 8, 34, 7, 13, 25, 20, 23, 30};
        System.out.println("Средний доход с продаж в месяц " + service.averageIncome(sales) + " Rub ");

    }

    @Test
    public void maxMonthOfSales() {
        StatsService service = new StatsService();
        long[] sales = {12, 3, 14, 6, 8, 34, 7, 13, 25, 20, 23, 30};
        System.out.println("Самый пик продаж был в " + service.maxSales(sales) + " месяце ");
    }

    @Test
    public void minMonthOfSales() {
        StatsService service = new StatsService();
        long[] sales = {12, 3, 14, 6, 8, 34, 7, 13, 25, 20, 23, 30};
        System.out.println("Минимальные продажи были в " + service.minSales(sales) + " месяце ");

    }

    @Test
    public void belowAverageIncome() {


        StatsService service = new StatsService();
        long[] sales = {12, 3, 14, 6, 8, 34, 7, 13, 25, 20, 23, 30};

        System.out.println("Количество месяцев с уровнем продаж ниже среднего было " + service.monthMinAverageSales(sales));

    }

    @Test
    public void aboveAverageIncome() {


        StatsService service = new StatsService();
        long[] sales = {12, 3, 14, 6, 8, 34, 7, 13, 25, 20, 23, 30};

        System.out.println("Количество месяцев с уровнем продаж выше среднего было " + service.monthMaxAverageSales(sales));
    }
}
