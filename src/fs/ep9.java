package fs;

import java.lang.reflect.Method;

public class ep9 {
    public static void main(String[] args)throws Exception{
        Method h = Person5.class.getMethod("Hello");
        h.invoke(new Student3());
    }
}
class Person5{
    public void Hello(){
        System.out.println("Person:Hello");
    }
}

class Student3 extends Person5{
    public void Hello(){
        System.out.println("Student:hello");
    }
}