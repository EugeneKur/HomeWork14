package ru.geekbrains.jca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;


import java.lang.reflect.Executable;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exersice1Test {



    @Test
    void method1() {
        Exersice1 exersice1 = new Exersice1();
        int[] testArray1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] resultTest1 = {1,7};
        Assertions.assertArrayEquals(resultTest1, exersice1.method1(testArray1));
        int[] testArray2 = {1, 2, 4, 4, 2, 3, 5, 1, 7};
        int[] resultTest2 = {2, 3, 5, 1, 7};
        Assertions.assertArrayEquals(resultTest2, exersice1.method1(testArray2));
        int[] testArray3 = {1, 2, 0, 0, 2, 3, 5, 1, 7};
        Assertions.assertThrows(RuntimeException.class, () ->exersice1.method1(testArray3));
    }

}