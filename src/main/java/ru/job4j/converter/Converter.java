package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 85;
    }

    public static float rubleToDollar(float value) {
        return value / 75;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(170);
        System.out.println("170 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(150);
        System.out.println("150 rubles are " + dollar + " dollar.");

        float in = 170;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("170 rubles are 2. Test result : " + passed);

        in = 150;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("150 rubles are 2. Test result : " + passed);
    }
}