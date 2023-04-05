package com.mycompany.laboratory4;

public class Project implements Comparable<Project>{
    private String name;
    private String difficulty;
    private int id;
    Project(String name,int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int compareTo(Project anotherProject) {
        return this.id - anotherProject.id;
    }
    
}
