package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;


    public Room(int numberOfBeds){
        this.numberOfBeds = numberOfBeds;
        this.price = 120.00;
        this.isDirty = false;
        this.isOccupied = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public double getPrice() {
        return price;
    }
    public boolean isAvailable(){
        //if (isOccupied || isDirty){
            //return false;
        //}
        //else {
            //return true;
        //}
        return !(isOccupied || isDirty);
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                ", price=" + price +
                ", isOccupied=" + isOccupied +
                ", isDirty=" + isDirty +
                '}';
    }
}
