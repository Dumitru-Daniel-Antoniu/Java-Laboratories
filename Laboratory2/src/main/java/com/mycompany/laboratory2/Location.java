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
class City extends Location {
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
class Airport extends Location {
    private int numberOfTerminals;
    private int ticketPrice;
    public Airport() {}
    public Airport(String name, double x, double y) {
        this.name=name;
        this.x=x;
        this.y=y;
    }
    public int getNumberOfTerminals() {
        return this.numberOfTerminals;
    }
    public void setNumberOfTerminals(int numberOfTerminals) {
        this.numberOfTerminals=numberOfTerminals;
    }
    public int getTicketPrice() {
        return this.ticketPrice;
    }
    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice=ticketPrice;
    }
}
class GasStation extends Location {
    private int gasPrice;
    private int numberOfFuelStations;
    private String typeOfGas;
    public GasStation() {}
    public GasStation(String name, double x, double y) {
        this.name=name;
        this.x=x;
        this.y=y;
    }
    public int getGasPrice() {
        return this.gasPrice;
    }
    public void setGasPrice(int gasPrice) {
        this.gasPrice=gasPrice;
    }
    public int getNumberOfFuelStations() {
        return this.numberOfFuelStations;
    }
    public void setNumberOfFuelStations(int numberOfFuelStations) {
        this.numberOfFuelStations=numberOfFuelStations;
    }
    public String getTypeOfGas() {
        return this.typeOfGas;
    }
    public void setTypeOfGas(String typeOfGas) {
        this.typeOfGas=typeOfGas;
    }
}