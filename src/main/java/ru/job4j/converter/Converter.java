package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static float euroToDollar(float value) {
        float result = value * 1.16F;
        return result;
    }

    public static float dollarToEuro(float value) {
        float result = value * 0.85F;
        return result;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);

        input = 120;
        expected = 2;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("120 rubles are 2. Test result : " + passed);

        input = 1000;
        expected = 1160;
        output = Converter.euroToDollar(input);
        passed = expected == output;
        System.out.println("1000 euro are 1160. Test result : " + passed);

        input = 1000;
        expected = 850;
        output = Converter.dollarToEuro(input);
        passed = expected == output;
        System.out.println("1000 dollars are 850. Test result : " + passed);

        }
}