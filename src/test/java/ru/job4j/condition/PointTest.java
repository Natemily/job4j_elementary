package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to20then0() {
        Point a = new Point(2, 0);
        Point b = new Point(2, 0);
        double expected = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to21then1dot41() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 1);
        double expected = 1.41;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to30then2dot23() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 0);
        double expected = 2.23;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111and301then2dot23() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(3, 0, 1);
        double expected = 2.23;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123and567then6dot92() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(5, 6, 7);
        double expected = 6.92;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}