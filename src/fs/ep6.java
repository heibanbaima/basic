package fs;

import java.lang.reflect.Method;

public class ep6 {
    public static void main(String[] args) throws Exception{
        String s = "Hello World";
        Method m = String.class.getMethod("substring", int.class);
        String r = (String)m.invoke(s,6);
        System.out.println(r);
    }
}
