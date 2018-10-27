package dev.singtel.interview;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Thusitha Nuwan
 */
public class DuckTest extends BaseTest{

    private String singCheck = "Quack, quack\r\n";
    private String swimCheck = "duck swimming\r\n";

    private Duck b = new Duck();


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

    @Test
    public void swim() {
        b.swim();
        String out = byteOut.toString();
        Assert.assertTrue(out.equals(swimCheck));
    }
}