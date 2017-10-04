package com.gmail.malynovskyiroman.java.stream_api.task1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Group {
    private ArrayList<Student> listStudents;
    private int number;

    public Group(int number) {
        this.listStudents = new ArrayList<>();
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public ArrayList<Student> getStudentsByLetterOfSurname(char character, Group group) {
        ArrayList<Student> list = group.listStudents.stream()
                .filter(student -> student.getSurname().startsWith(String.valueOf(character)))
                .collect(Collectors.toCollection(ArrayList::new));
        return list;
    }

    public void addStudent(Student student) {
        if (listStudents.contains(student)) {
            System.out.println("Group " + this.number + " already contains " + student.toString());
            return;
        } else {
            student.setGroupNumber(number);
            listStudents.add(student);
        }

    }

    public void removeStudent(Student student) {
        if (listStudents.contains(student)) {
            listStudents.remove(student);
        } else {
            System.out.println("Student not not founded!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (number != group.number) return false;
        return listStudents.equals(group.listStudents);
    }

    @Override
    public int hashCode() {
        int result = listStudents.hashCode();
        result = 31 * result + number;
        return result;
    }

    public void printGroup() {
        System.out.println("Group № " + number);
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }
}
