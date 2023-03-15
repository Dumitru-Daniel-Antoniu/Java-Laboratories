package com.mycompany.laboratory2;

public class Airport extends Location {
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