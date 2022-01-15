package test.java.ru.job4j.condition;

import main.java.ru.job4j.condition.Max;
import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1to2then2() {
        int x2 = 1;
        int x1 = 2;
        int y = Max.maximum(x1, x2);
        int expected = 2;
        Assert.assertEquals(expected, y);
    }

    @Test
    public void whenMax3to2then3() {
        int x2 = 3;
        int x1 = 2;
        int y = Max.maximum(x1, x2);
        int expected = 3;
        Assert.assertEquals(expected, y);
    }

    @Test
    public void whenMax2to2then2() {
        int x2 = 2;
        int x1 = 2;
        int y = Max.maximum(x1, x2);
        int expected = 2;
        Assert.assertEquals(expected, y);
    }
}