package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert170RblThen2Euro() {
        float in = 170;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert150RblThen2Dlr() {
        float in = 150;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}