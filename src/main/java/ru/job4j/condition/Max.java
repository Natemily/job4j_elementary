package main.java.ru.job4j.condition;

public class Max {
    public static int maximum(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        System.out.println(Max.maximum(5, 7));
    }
}
