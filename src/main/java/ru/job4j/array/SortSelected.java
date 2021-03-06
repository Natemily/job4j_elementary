package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] ex = new int[] {5, 4, 2, 3, 1};
        sort(ex);
        for (int i = 0; i < ex.length; i++) {
            System.out.println(ex[i]);
        }
    }
}