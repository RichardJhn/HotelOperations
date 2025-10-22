package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){


        ArrayList<Room> rooms = new ArrayList<>();
        Room r101 = new Room(1);
        Room r102 = new Room(2);
        Room r103 = new Room(2);
        Room r104 = new Room(2);


        rooms.add(r101);
        rooms.add(r102);
        rooms.add(r103);
        rooms.add(r104);


        for (Room r : rooms){
            System.out.println(r);
        }

        ArrayList<Reservation> reservations = new ArrayList<>();
        Reservation res1 = new Reservation("king", 1, false);
        Reservation res2 = new Reservation("king", 2, true);
        Reservation res3 = new Reservation("king", 3, false);
        Reservation res4 = new Reservation("king", 5, false);


        reservations.add(res1);
        reservations.add(res2);
        reservations.add(res3);
        reservations.add(res4);
        ArrayList<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(1, "john", "HR", 12);


        for (Employee e : employees){
            System.out.println(e);
        }



    }

}
