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
public class AnimalTest {

    private ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
    private boolean autoFlush = false;
    private PrintStream out = new PrintStream(byteOut, autoFlush);
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