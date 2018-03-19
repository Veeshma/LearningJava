package VehiclesTest;

import Vehicles.Bike;
import org.junit.Assert;
import org.junit.Test;

public class BikeTest {

    private static Bike bike = new Bike();

    @Test
    public void verifyPriceCalculation(){
        double priceForHardley = bike.calculateCarPrice(2015,20000,"Hardley");
        double priceForDucati = bike.calculateCarPrice(2015,20000,"Ducati");
        Assert.assertTrue(priceForHardley > priceForDucati);
    }

    @Test
    public void verifyDrive(){
        bike.drive();
        Assert.assertTrue(bike.getGear().equals("1"));
        Assert.assertTrue(bike.getSpeed() == 10);
        Assert.assertFalse(bike.isApplyBrake());
    }
}
