package com.mycompany.laboratory2;

class Location {
    private String name;
    private float x;
    private float y;
    public enum Type {
        CITY, AIRPORT, GAS_STATION;
    }
    public Location() {}
    public Location(String name, float x, float y) {
        this.name=name;
        this.x=x;
        this.y=y;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x=x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y=y;
    }
    @Override
    public String toString() {
        return super.toString(); 
    }
    
}
