package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code

        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        parcels [0] = new Parcel(26.0,ParcelStatus.SHIPPING,new Location(205.0,25.0));
        parcels [1] = new Parcel(27.0,ParcelStatus.DELIVERED ,new Location(154.0,315.0));
        parcels [2] = new Parcel(17.0,ParcelStatus.READY_TO_SHIP,new Location(125.0,85.0));
        parcels [3] = new Parcel(48.0,ParcelStatus.DELIVERED,new Location(5.0,93.0));
        parcels [4] = new Parcel(3.0,ParcelStatus.SHIPPING,new Location(5.0,77.0));
        parcels [5] = new Parcel(11.0,ParcelStatus.SHIPPING,new Location(10.0,56.0));
        parcels [6] = new Parcel(16.0,ParcelStatus.DELIVERED,new Location(25.0,25.0));
        parcels [7] = new Parcel(22.0,ParcelStatus.READY_TO_SHIP,new Location(33.0,3.0));
        parcels [8] = new Parcel(5.0,ParcelStatus.SHIPPING,new Location(56.0,48.0));
        parcels [9] = new Parcel(25.0,ParcelStatus.DELIVERED,new Location(35.0,44.0));
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        //printBike();
        //printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
