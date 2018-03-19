package Vehicles;

import java.util.Hashtable;

public class Bike extends Vehicle {

    public int door = 0;


    public double calculateCarPrice(double yearOfManufacturing, double milesCovered, String brand){
        Hashtable<String,Integer> carValue = new Hashtable<String,Integer>();
        carValue.put("Hardley",30000);
        carValue.put("Ducati",10000);
        double calculatedPrice = calculatePrice(yearOfManufacturing,milesCovered,carValue.get(brand));
        return calculatedPrice;
    }

    public void drive(){
        setGear("1");
        setSpeed(10);
        setApplyBrake(false);
    }

}
