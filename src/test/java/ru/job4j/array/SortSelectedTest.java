package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{8, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 5, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort4() {
        int[] data = new int[]{4, 2, 1, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }
}