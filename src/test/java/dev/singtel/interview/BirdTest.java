package dev.singtel.interview;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author Thusitha Nuwan
 */
public class BirdTest {
    private ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
    private boolean autoFlush = false;
    private PrintStream out = new PrintStream(byteOut, autoFlush);

    private String flyCheck = "I am flying\r\n";
    private String singCheck = "I am singing\r\n";

    private Bird b = new Bird();


    @Before
    public void setup(){
        System.setOut(out);
    }


    @Test
    public void fly() throws IOException {


        b.fly();
        String out = byteOut.toString();
        Assert.assertTrue(out.equals(flyCheck));

    }

    @Test
    public void sing() {
        b.sing();
        String out = byteOut.toString();
        Assert.assertTrue(out.equals(singCheck));
    }
}