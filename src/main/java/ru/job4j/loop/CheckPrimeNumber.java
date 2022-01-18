package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 1; i < number; i++) {
            if (number % i == 0 && i != 1) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(5));
        System.out.println(check(8));
        System.out.println(check(1));
    }
}
