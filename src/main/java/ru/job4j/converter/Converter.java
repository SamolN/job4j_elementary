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
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
        euro  = Converter.euroToDollar(1000);
        System.out.println("1000 euro are " + euro + " dollar.");
        dollar = Converter.dollarToEuro(1000);
        System.out.println("1000 dollars are " + dollar + " euro.");
    }
}