package ru.netology.services;

public class RestService {
    public int calculate( int money, int income, int expense, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        for (int month = 0; month < 12; month++) {
            if (money <= threshold) { // если денег меньше, чем threshold
                money = money + income - expense;
            } else {
                money = (money - expense) / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            }
        }
        return count;
    }
}
