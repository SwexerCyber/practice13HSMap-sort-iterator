package com.company;

public class Student implements Comparable<Student>{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "id = " + id + " name = " + name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
