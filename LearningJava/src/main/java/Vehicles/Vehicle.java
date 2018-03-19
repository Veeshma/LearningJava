package Vehicles;

import java.util.Calendar;

public class Vehicle {

    public String gear;
    public boolean applyBrake;
    public int speed = 0;

    public void calculateSpeed(int distanceCovered, int timeTaken){
        speed = distanceCovered / timeTaken;
    }

    public void stop(){
        setGear("N");
        setSpeed(0);
        setApplyBrake(true);
    }

    public double calculatePrice(double yearOfManufacturing, double milesCovered, double currentMarketValue){
        double noOfYearsOld = Calendar.getInstance().get(Calendar.YEAR) - yearOfManufacturing;
        double price = currentMarketValue - (milesCovered/noOfYearsOld);
        return price;
    }


    public String getGear() {
        return this.gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

     public boolean isApplyBrake() {
        return this.applyBrake;
    }

    public void setApplyBrake(boolean applyBrake) {
        this.applyBrake = applyBrake;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
