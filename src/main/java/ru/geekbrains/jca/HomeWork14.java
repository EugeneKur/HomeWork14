package ru.geekbrains.jca;

public class HomeWork14 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        printArray(Exersice1.method1(originalArray));
        System.out.println(Exercise2.method2(originalArray));
    }

    static void  printArray(int[] arr) { //метод печати интового массива
        for (int y = 0; y < arr.length; y++) {
            System.out.print(arr[y] + "  ");
        }
        System.out.println();
    }
}

