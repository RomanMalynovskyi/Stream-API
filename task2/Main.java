package com.gmail.malynovskyiroman.java.stream_api.task2;

      /*Напишите метод который найдет в массиве целых чисел число модуль
        которого ближе всего к 0. Если есть два таких числа (например 2 и -2)
        верните положительное.*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int[] array = {-3, -1, 4, 2, 1, 5, -1, -2, 3, 7};

        System.out.println(digitcloseToZero(array));
    }

    public static int digitcloseToZero(int[] array) {
        int result = Arrays.stream(array)
                .mapToObj(n -> n)
                .sorted((x, y) -> y - x)
                .collect(Collectors.minBy(Comparator.comparingInt(Math::abs))).get();
        return result;
    }
}
