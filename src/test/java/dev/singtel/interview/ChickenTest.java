package dev.singtel.interview;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Thusitha Nuwan
 */
public class ChickenTest extends BaseTest{

    private String singCheck = "Cluck, cluck\r\n";

    private Chicken b = new Chicken();


    @Before
    public void setup(){
        System.setOut(out);
    }


    @Test
    public void sing() {
        b.sing();
        String out = byteOut.toString();
        Assert.assertTrue(out.equals(singCheck));
    }

}