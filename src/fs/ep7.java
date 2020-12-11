package fs;

import java.lang.reflect.Method;

public class ep7 {
    public static void main(String[] args) throws Exception {
        Method m = Integer.class.getMethod("parseInt", String.class);
        Integer n = (Integer) m.invoke(null, "12345");
        System.out.println(n);
    }
}
