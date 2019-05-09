package com.example.p04_practical_quiz;

public class Student {
    private int id;
    private String name;
    private Double gpa;

    public Student(int id, String name, Double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getGpa() {
        return gpa;
    }
}
