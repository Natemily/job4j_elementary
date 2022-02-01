package ru.job4j.condition;


import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.Max;

public class MaxTest {

    @Test
    public void whenMax1to2then2() {
        Max max = new Max();
        int y = max.maximum(2, 1);
        int expected = 2;
        Assert.assertEquals(expected, y);
    }

    @Test
    public void whenMax3to2then3() {
        Max max = new Max();
        int y = max.maximum(2, 3);
        int expected = 3;
        Assert.assertEquals(expected, y);
    }

    @Test
    public void whenMax2to2then2() {
        Max max = new Max();
        int y = max.maximum(2, 2);
        int expected = 2;
        Assert.assertEquals(expected, y);
    }
}