package ru.geekbrains.jca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {
    private Exercise2 exercise2;

    @BeforeEach
    void init () {
        exercise2 = new Exercise2();
    }

 /*   @CsvFileSource(files = {"test_cases/t2.csv"})  // Не понимаю как в csv файле задать массив
    @ParameterizedTest
    void parametrizedMethod2Test(int[] arr, boolean res) {
        if (res) {
            Assertions.assertTrue(exercise2.method2(arr));
        }
        if (!res) {
            Assertions.assertFalse(exercise2.method2(arr));
        }

    }
*/
    @Test
    void method2test1() {
        int[] testArray1 = {1,1,1,1,1,1,1};
        Assertions.assertFalse(exercise2.method2(testArray1));
    }
    @Test
    void method2test2() {
        int[] testArray2 = {4,4,4,4,4,4};
        Assertions.assertFalse(exercise2.method2(testArray2));
    }
    @Test
    void method2test3() {
        int[] testArray3 = {1,4,4,1,4,1};
        Assertions.assertTrue(exercise2.method2(testArray3));
    }
    @Test
    void method2test4() {
        int[] testArray4 = {4,3,1,3,4,5};
        Assertions.assertFalse(exercise2.method2(testArray4));
    }
}