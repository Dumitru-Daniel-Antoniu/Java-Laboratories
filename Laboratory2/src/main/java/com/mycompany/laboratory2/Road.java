package com.mycompany.laboratory2;

public class Road {
    static float length;
    static int speedLimit;
    public enum Type {
        HIGHWAY, EXPRESS, COUNTRY;
    }
    public Road() {}
    public Road(float length, int speedLimit) {
        this.length=length;
        this.speedLimit=speedLimit;
    }
    public float getLength() {
        return this.length;
    }
    public void setLength(float length) {
        this.length=length;
    }
    public int getSpeedLimit() {
        return this.speedLimit;
    }
    public void setSpeedLimit(int speedLimit) {
        this.speedLimit=speedLimit;
    }
    @Override
    public String toString() {
        return super.toString(); 
    }
    
}
