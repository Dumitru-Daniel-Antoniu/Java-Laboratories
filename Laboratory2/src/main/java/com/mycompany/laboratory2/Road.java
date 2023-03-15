package com.mycompany.laboratory2;

public abstract class Road {
    protected String name;
    protected double length;
    protected int speedLimit;
    protected Location a;
    protected Location b;
    //protected RoadType type;
    public Road() {}
    public Road(String name, Location a, Location b) {
        this.name=name;
        this.a=a;
        this.b=b;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length=length;
    }
    public int getSpeedLimit() {
        return this.speedLimit;
    }
    public void setSpeedLimit(int speedLimit) {
        this.speedLimit=speedLimit;
    }
    /*public RoadType getType() {
        return this.type;
    }
    public void setType(RoadType type) {
        this.type=type;
    }*/
    public Location getA() {
        return this.a;
    }
    public void setA(Location a) {
        this.a=a;
    }
    public Location getB() {
        return this.b;
    }
    public void setB(Location b) {
        this.b=b;
    }
    @Override
    public String toString() {
        return name; 
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Road)) {
            return false;
        }
        Road other = (Road) obj;
        return name.equals(other.name);
    }  
}
class Highway extends Road {
    public Highway() {}
    public Highway(String name, Location a, Location b) {
        this.name=name;
        this.a=a;
        this.b=b;
    }
}
class Express extends Road {
    public Express() {}
    public Express(String name, Location a, Location b) {
        this.name=name;
        this.a=a;
        this.b=b;
    }
}
class Country extends Road {
    public Country() {}
    public Country(String name, Location a, Location b) {
        this.name=name;
        this.a=a;
        this.b=b;
    }
}
