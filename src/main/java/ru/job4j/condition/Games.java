package ru.job4j.condition;

public class Games {
    public static void permission(boolean allowParent, boolean hasMoney) {
        if (allowParent && hasMoney) {
            System.out.println("I can go to the club");
        } else {
            System.out.println("I can't");
        }
    }

    public static void main(String[] args) {
        Games.permission(true, true);
    }
}
