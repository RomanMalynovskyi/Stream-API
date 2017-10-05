package com.gmail.malynovskyiroman.java.stream_api.task4;

        /*Найдите максимальное число из набора чисел которые хранятся в
        текстовом файле.
        Внимание! 3адание решить используя stream API.*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(getMaxNumberFromFile("z:\\src.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getMaxNumberFromFile(String path) throws IOException {
        int result = Files.lines(Paths.get(path))
                .flatMap(n -> Arrays.stream(n.split(",")))
                .mapToInt(Integer::parseInt)
                .max()
                .orElse(0);
        return result;
    }
}
