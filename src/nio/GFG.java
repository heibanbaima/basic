package nio;

// Java program to demonstrate position() method

import java.nio.*;
import java.util.*;

public class GFG {

    public static void main(String[] args)
    {
        byte[] barr = { 10, 20, 30, 40 };

        // creating object of ByteBuffer and allocating size capacity
        ByteBuffer bb = ByteBuffer.wrap(barr);

        System.out.println(Arrays.toString(bb.array()));

        // try to set the position at index 2 using position() method
        bb.position(2);

        // Set this buffer mark position
        bb.mark();

        // try to set the position at index 4 using position() method
        bb.position(4);

        // display position
        System.out.println("position before reset: " + bb.position());

        // try to call reset() to restore to the position we marked
        bb.reset();

        // display position
        System.out.println("position after reset: " + bb.position());
    }
}

