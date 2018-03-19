package Vehicles;

import java.util.Hashtable;

public class Car extends Vehicle {


    public int door;

    public int getDoor() {
        return this.door;
    }

    public void setDoor(int door) {
        this.door = door;
    }


    public double calculateCarPrice(double yearOfManufacturing, double milesCovered, String brand){
        Hashtable<String,Integer> carValue = new Hashtable<String,Integer>();
        carValue.put("BMW",50000);
        carValue.put("Honda",20000);
        double calculatedPrice = calculatePrice(yearOfManufacturing,milesCovered,carValue.get(brand));
        return calculatedPrice;
    }

    public void drive(){
        setGear("D");
        setSpeed(15);
        setApplyBrake(false);
    }

}
