package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first != second && first != third && second != third) {
            if (first > second && first > third) {
                result = first;
            } else if (second > first && second > third) {
                result = second;
            } else {
                result = third;
            }
            return result;
        } else if (first == second && first > third) {
            result = first;
        } else if (first == third && first > second) {
            result = first;
        } else {
            result = second;
        }
        return result;
    }
}