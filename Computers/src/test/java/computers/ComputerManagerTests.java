package computers;

import org.junit.Assert;
import org.junit.Test;

public class ComputerManagerTests {


    @Test
    public void testGetManufacturerName() {
Computer computer=new Computer("test1", "model1", 10.0);
        Assert.assertEquals("test1", computer.getManufacturer());
    }

    @Test
    public void testGetModelName() {
        Computer computer=new Computer("test1", "model1", 10.0);
        Assert.assertEquals("model1", computer.getModel());
    }

    @Test
    public void testGetPrice() {
        Computer computer=new Computer("test1", "model1", 10.0);
        Assert.assertEquals(10.0, computer.getPrice(), 0);
    }



}