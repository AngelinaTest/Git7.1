package ru.netology.stats.Java7.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsTest {

    @Test
    public void shouldFindMinMonth() {
        Stats service = new Stats();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {
        Stats services = new Stats();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = services.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSumSales() {
        Stats service = new Stats();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageSales() {
        Stats service = new Stats();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreAverageSales() {
        Stats service = new Stats();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.moreAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLessAverageSales() {
        Stats service = new Stats();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.lessAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}