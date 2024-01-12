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

        float input1 = 120;
        float expected1 = 2;
        float output1 = Converter.rubleToDollar(input1);
        boolean passed1 = expected == output;
        System.out.println("120 rubles are 2. Test result : " + passed1);

        float input3 = 1000;
        float expected3 = 1160;
        float output3 = Converter.euroToDollar(input3);
        boolean passed3 = expected3 == output3;
        System.out.println("1000 euro are 1160. Test result : " + passed3);

        float input4 = 1000;
        float expected4 = 850;
        float output4 = Converter.dollarToEuro(input4);
        boolean passed4 = expected4 == output4;
        System.out.println("1000 dollars are 850. Test result : " + passed4);

        }
}