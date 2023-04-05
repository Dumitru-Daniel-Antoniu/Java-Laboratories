package com.mycompany.laboratory4;

public class Student implements Comparable<Student> { 
    private String name;
    private int year;
    private int id;
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int compareTo(Student anotherStudent) {
        return this.id - anotherStudent.id;
    }  
}
