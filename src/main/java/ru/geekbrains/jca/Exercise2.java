package ru.geekbrains.jca;

public class Exercise2 {
    public static boolean method2 (int[] arr) {
        int COUNT_ONE = 0;
        int COUNT_FOUR = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                COUNT_ONE ++;
            }
            else if (arr[i] == 4) {
                COUNT_FOUR ++;
            }
            else {
                return false;
            }
        }
        return (COUNT_ONE > 0 && COUNT_FOUR >0);
    }
}
