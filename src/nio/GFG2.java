package nio;

// Java program 2 to demonstrate position() method

import java.nio.*;
import java.util.*;

public class GFG2 {

    public static void main(String[] args)
    {
        // creating object of ByteBuffer and allocating size capacity
        ByteBuffer bb = ByteBuffer.allocate(4);

        // try to set the position at index 1 using position() method
        bb.position(1);

        // putting the value of ByteBuffer using put() method
        bb.put((byte)10);

        // try to set the position at index 3 using position() method
        bb.position(3);

        // putting the value of ByteBuffer using put() method
        bb.put((byte)30);

        // display position
        System.out.println("ByteBuffer: " + Arrays.toString(bb.array()));
    }
}

