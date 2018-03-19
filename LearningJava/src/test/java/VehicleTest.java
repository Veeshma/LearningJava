import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void verifyName_Size_currentVelocity_currentDirection(){
        Vehicle vehicle = new Vehicle("Outlander","4WD");
        Assert.assertTrue(vehicle.getName().equals("Outlander"));
        Assert.assertTrue(vehicle.getSize().equals("4WD"));
        Assert.assertTrue(vehicle.getCurrentDirection() == 0);
        Assert.assertTrue(vehicle.getCurrentVelocity() == 0);
    }

}