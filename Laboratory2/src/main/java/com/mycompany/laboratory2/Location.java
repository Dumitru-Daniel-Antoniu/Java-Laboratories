package com.mycompany.laboratory2;

public abstract class Location {
    protected String name;
    protected double x;
    protected double y;
    //protected LocationType type;
    public Location() {}
    public Location(String name, double x, double y) {
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
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x=x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y=y;
    }
    /*public LocationType getType() {
        return this.type;
    }
    public void setType(LocationType type) {
        this.type=type;
    }*/
    @Override
    public String toString() {
        return name; 
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Location)) {
            return false;
        }
        Location other = (Location) obj;
        return name.equals(other.name);
    }
}