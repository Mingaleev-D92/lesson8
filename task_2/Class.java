package ru.innopolis.university.mingaleev.homework_3_8.task_2;

public class Class {
     private static int count;
     private char size;
     private String color;
     private int cost;

    public Class(char size, String color, int cost) {
        this.size = size;
        this.color = color;
        this.cost = cost;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {

    }
}
