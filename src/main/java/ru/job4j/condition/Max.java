package ru.job4j.condition;

public class Max {

    public static int maximum(int first, int second) {
        return first > second ? first : second;
    }

    public static int maximum(int first, int second, int third) {
        return maximum(third, maximum(first, second));
    }

    public static int maximum(int first, int second, int third, int fourth) {
        return maximum(maximum(first, second), maximum(third, fourth));
    }

    public static void main(String[] args) {
        System.out.println(maximum(5, 7, 9, 12));
    }
}
