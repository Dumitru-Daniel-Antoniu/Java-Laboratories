package com.mycompany.laboratory3;

public abstract class Person implements Node, Comparable<Person>{
    protected int id;
    protected String name;
    protected int age;
    protected int salary;
    protected int yearsOfWork;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public int getId() {
        return this.id;
    }
    @Override
    public void setId(int id) {
        this.id=id;
    } 
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}
