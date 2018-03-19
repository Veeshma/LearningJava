package VehiclesTest;

import Vehicles.Car;
import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    private static Car car = new Car();

    @Test
    public void verifyPriceCalculation(){
        double priceForHonda = car.calculateCarPrice(2015,20000,"Honda");
        double priceForBMW = car.calculateCarPrice(2015,20000,"BMW");
        Assert.assertTrue(priceForBMW > priceForHonda);
    }

    @Test
    public void verifyDrive(){
        car.drive();
        Assert.assertTrue(car.getGear().equals("D"));
        Assert.assertTrue(car.getSpeed() == 15);
        Assert.assertFalse(car.isApplyBrake());
    }

    @Test
    public void verifySpeedOnApplyingBrake(){
        car.stop();
        Assert.assertTrue(car.getSpeed()==0);
    }
}
