package ru.job4j.condition;

public class Max {

    public int maximum(int first, int second) {
        return first > second ? first : second;
    }

    public int maximum(int first, int second, int third) {
        return maximum(third, maximum(first, second));
    }

    public int maximum(int first, int second, int third, int fourth) {
        return maximum(maximum(first, second), maximum(third, fourth));
    }

    public static void main(String[] args) {
        Max max = new Max();
        System.out.println(max.maximum(5, 7, 9, 12));
    }
}
