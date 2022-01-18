package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        for (int i = 0; i < 100; i++) {
            amount = amount + amount * percent / 100 - salary;
            year++;
            if (amount <= 0) {
                break;
            }
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(1000, 1200, 1));
        System.out.println(year(100, 70, 50));
        System.out.println(year(100, 120, 30));
    }
}
