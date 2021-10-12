package ru.geekbrains.jca;

public class Exersice1 {
    public static int[] method1(int[] intArray) {
        int REST = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 4) {
                REST = intArray.length-i-1;
            }
        }
        int[] changesArray = new  int[REST];
        for (int i = 0; i < REST; i++) {
            changesArray[i] = intArray[intArray.length-REST+i];
        }
        if (REST == 0) {
            throw new RuntimeException("Array don't contain 4");
        }
        return changesArray;
    }
}
