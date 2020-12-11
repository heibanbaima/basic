package fs;

import java.lang.reflect.Field;

public class ep3 {
    public static void main(String[] args) throws Exception{
        Object p = new Person1("Xiao Ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value);
    }
}


class Person1{
    private String name;
    public Person1(String name){
        this.name=name;
    }
}