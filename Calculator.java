package ru.innopolis.university.mingaleev.homework_3_8.task_1;

public class Calculator {
    public static int subtractionInt(int a, int b) {
        return (a - b);
    }

    public static int additionInt(int a, int b) {
        return (a + b);
    }

    public static int multiplicationInt(int a, int b) {
        return (a * b);
    }

    public static int divisionInt(int a, int b) {
        return (a / b);
    }

    public static int percentInt(int a, int percent) {
        return (a / (100 * percent));
    }

    public static double subtractionDouble(double a, double b) {
        return (a - b);
    }

    public static double additionDouble(double a, double b) {
        return (a + b);
    }

    public static double multiplicationDouble(double a, double b) {
        return (a * b);
    }

    public static double divisionDouble(double a, double b) {
        return (a / b);
    }

    public static double percentDouble(double a, double percent) {
        return a / (100 * percent); }
}