package org.example;

import java.util.Arrays;

public class Main {
    public void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public void checkSumSigh() {
        int a = 11;
        int b = -12;
        int c = (a + b);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int valye = 101;
        if (valye <= 0)
        {
            System.out.println("Красный");
        }
        else if (valye > 100 && valye != 100)
        {
            System.out.println("Зеленый");
        }
        else if (valye <= 100)
        {
            System.out.println("Желтый");
        }
    }

    public static void compareNumbers() {
        int a = 15;
        int b = 12;
        if (a >= b)
        {
            System.out.println("a >= b");
        }
        else
        {
            System.out.println("a < b");
        }
    }
    public static void metodA() {
        int a = 10;
        int b = 20;
        int c = a + b;
        if (c >= 10 && c <= 20)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    public static void metodB() {
        int a = -1;
        if (a >= 0)
        {
            System.out.println("Положительное число");
        }
        else
        {
            System.out.println("Отрицательное число");
        }
    }
    public static void metodC() {
        int i = 0;
        boolean c = i < 0;
        System.out.println (c);
    }
    public static void metodD() {
       for (int i = 0; i < 10; i++) {
           if (i >= 3) {
               break;
           }
           System.out.println(i + " I love java");
       }
    }
    public static void metodE() {
        int year = 2025;
        boolean c = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        {
            System.out.println(c);
        }
    }

    public static void metodF() {
        int[] array = {1, 0, 1, 0, 1, 1, 0, 0, 0, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) array[i] = 1 - array[i];
        System.out.println(Arrays.toString(array));
    }
    public static void metodG() {
        int[] array = new int [100];
        for (int i = 0; i < array.length; i++) array[i] = i + 1;
        System.out.println(Arrays.toString(array));
    }
    public static void metodH() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        System.out.println(Arrays.toString(array));
    }
    public static void metodI() {
        int[][] matrix = new int [3][3];
        for (int i = 0; i < 3; i++) {
            matrix[i][i] = 1;
            matrix[i][3 - i - 1] = 1;
        }
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < 3; i++)
        {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void metodJ() {
        int len = 10;
        int initialValue = 6;
        int[] array = new int [len];
        for (int i = 0; i < array.length; i++) array[i] = initialValue;
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        Main Lesson = new Main();
        Lesson.printThreeWords();
        Lesson.checkSumSigh();
        Lesson.printColor();
        Lesson.compareNumbers();
        Lesson.metodA();
        Lesson.metodB();
        Lesson.metodC();
        Lesson.metodD();
        Lesson.metodE();
        Lesson.metodF();
        Lesson.metodG();
        Lesson.metodH();
        Lesson.metodI();
        Lesson.metodJ();
    }
}


