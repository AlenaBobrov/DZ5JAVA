package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/months.csv")
    public void RestCalculate(int expected, int money, int income, int expense, int threshold) {
        RestService service = new RestService();

        //  int money = 0;
        //  int income = 100_000;
        //  int expense = 60_000;
        //  int threshold = 150_000;
        //  int expected = 2;

        int actual = service.calculate(money, income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}