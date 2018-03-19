import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void verifyCarDetails(){
        Car car = new Car("Audi", "2WD");
        Assert.assertTrue(car.getName().equals("Audi"));
        Assert.assertTrue(car.getSize().equals("2WD"));
    }

    @Test
    public void verifySpeedCalculation(){
        Car car = new Car();
        car.setDistanceCovered(200);
        car.setTimeTaken(10);
        Assert.assertTrue(car.calculateSpeed() == 20);
    }
}
