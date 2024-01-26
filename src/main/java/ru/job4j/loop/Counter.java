package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int evenSum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        return evenSum;
    }
}
