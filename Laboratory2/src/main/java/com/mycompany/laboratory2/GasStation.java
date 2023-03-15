package com.mycompany.laboratory2;

public class GasStation extends Location {
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
