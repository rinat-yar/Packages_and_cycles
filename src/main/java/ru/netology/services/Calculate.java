package ru.netology.services;

public class Calculate {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; //
        int money = 0; //
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}