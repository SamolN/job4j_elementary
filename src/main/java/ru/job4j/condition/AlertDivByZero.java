package ru.job4j.condition;

public class AlertDivByZero {
    public static void checkNumber(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0.");
        }
        result = number < 0;
        if (result) {
            System.out.println("Negative number");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.checkNumber(-4);
        AlertDivByZero.checkNumber(0);
    }
}