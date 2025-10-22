package com.pluralsight;

public class Reservation {
    public Reservation(String roomType, int numberOfNights, boolean isWeekend){
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {//
        // The room can be either king or double
        double basePrice;
        if(roomType.equalsIgnoreCase("king")){
            basePrice = 139;
        }
        else if (roomType.equalsIgnoreCase("double")){
            basePrice = 124;
        }
        else{
            return 0;
        }
        if(isWeekend){
            return basePrice * 1.10;
        }
        else {
            return basePrice;
        }

    }
    public double getReservationTotal(){
        return getPrice() * numberOfNights;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "roomType='" + roomType + '\'' +
                ", numberOfNights=" + numberOfNights +
                ", isWeekend=" + isWeekend +
                "getPrice()=" + getPrice() +
                "getReservationTotal()=" + getReservationTotal() +
                '}';
    }
}
