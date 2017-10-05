package com.gmail.malynovskyiroman.java.stream_api.task3;


       /* На основе строки сгенерируйте массив целых чисел, каждое число
        должно быть ASCII кодом соответствующей буквы.
        Внимание!3адание решить используя stream API.*/

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = new String("Attention! You must solve the problem using the stream API.");
        int[] array = s.chars()
                .filter(n -> Character.isLetter(n))
                .toArray();

        System.out.println(Arrays.toString(array));
    }
}
