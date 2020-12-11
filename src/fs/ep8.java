package fs;

import java.lang.reflect.Method;

public class ep8 {
    public static void main(String[] args) throws Exception{
        Person4 p = new Person4();
        Method m = p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true);
        m.invoke(p,"Bob");
        System.out.println(p.name);
    }
}

class Person4{
    String name;
    private void setName(String name){
        this.name=name;
    }
}
