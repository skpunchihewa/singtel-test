package dev.singtel.interview;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * @author Thusitha Nuwan
 */
public class AnimalTest extends BaseTest{


    private Animal animal = new Animal();

    private String walkCheck = "I am walking\r\n";

    @Before
    public void setup(){
        System.setOut(out);
    }


    @Test
    public void walk() {
        animal.walk();
        String out = byteOut.toString();
        Assert.assertTrue(out.equals(walkCheck));
    }
}