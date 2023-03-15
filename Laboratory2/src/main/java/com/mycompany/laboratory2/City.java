package com.mycompany.laboratory2;

public class City extends Location {
    private int population;
    private int numberOfBuildings;
    private int coIndex;
    public City() {}
    public City(String name, double x, double y) {
        this.name=name;
        this.x=x;
        this.y=y;
    }
    public int getPopulation() {
        return this.population;
    }
    public void setPopulation(int population) {
        this.population=population;
    }
    public int getNumberOfBuildings() {
        return this.numberOfBuildings;
    }
    public void setNumberOfBuildings(int numberOfBuildings) {
        this.numberOfBuildings=numberOfBuildings;
    }
    public int getCoIndex() {
        return this.coIndex;
    }
    public void setCoIndex(int coIndex) {
        this.coIndex=coIndex;
    }
} 
