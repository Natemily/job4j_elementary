package ru.job4j.condition;


import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.Max;

import static ru.job4j.condition.Max.maximum;

public class MaxTest {

    @Test
    public void whenMax1to2then2() {
        int y = maximum(2, 1);
        int expected = 2;
        Assert.assertEquals(expected, y);
    }

    @Test
    public void whenMax3to2then3() {
        int y = maximum(2, 3);
        int expected = 3;
        Assert.assertEquals(expected, y);
    }

    @Test
    public void whenMax2to2then2() {
        int y = maximum(2, 2);
        int expected = 2;
        Assert.assertEquals(expected, y);
    }

    @Test
    public void whenMax2and3and4then4() {
        int y = maximum(2, 3, 4);
        int expected = 4;
        Assert.assertEquals(expected, y);
    }

    @Test
    public void whenMax7and2and5and15then15() {
        int y = maximum(7, 2, 5, 15);
        int expected = 15;
        Assert.assertEquals(expected, y);
    }
}