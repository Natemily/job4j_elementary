package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K3Square0dot75() {
        double p = 4;
        double k = 3;
        double expected = 0.75;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K1Square1dot56() {
        double p = 5;
        double k = 1;
        double expected = 1.56;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP2K5Square0dot13() {
        double p = 2;
        double k = 5;
        double expected = 0.13;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}