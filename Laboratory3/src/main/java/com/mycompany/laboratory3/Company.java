package com.mycompany.laboratory3;

public class Company implements Node, Comparable<Company>{
    private int id;
    private String name;
    private int numberOfWorkers;
    private String domain;
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
    public int compareTo(Company other) {
        return this.name.compareTo(other.name);
    }
}
