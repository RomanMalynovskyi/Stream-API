package com.gmail.malynovskyiroman.java.stream_api.task1;

        /*
        1. Напишите методы которые позволят выделить из группы студентов тех, у
        кого фамилия начинается с определенной буквы.
        Внимание!3адание решить используя stream API*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Group group = new Group(1);

        Student student1 = new Student("Roman", "Malynovskyi", "Male", 16, 12345);
        Student student2 = new Student("Natalia", "Byrlachenko", "Female", 18, 56789);
        Student student3 = new Student("Viktoria", "Dybinskaya", "Female", 21, 45678);
        Student student4 = new Student("Sergiy","Malynovskyi", "Male", 20, 26835);
        Student student5 = new Student("Irina", "Borusyk","Female", 21, 77235);
        Student student6 = new Student("Maryna", "Malynovskaya","Female", 22, 79045);
        Student student7 = new Student("Taras", "Dybinskiy","Male", 19, 55883);

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);


        group.printGroup();

        System.out.println();

        ArrayList<Student> list= group.getStudentsByLetterOfSurname('D', group);

        System.out.println(list);

    }
}
