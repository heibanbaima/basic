package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class equals {
    public static void main(String[] args){
        List<Person> list=new ArrayList<>();
        list.add(new Person("Xiao Ming"));
        list.add(new Person("Xiao Hong"));
        list.add(new Person("Bob"));
        System.out.println(list.contains(new Person("Bob")));
    }
}

class Person{
    public String name;
    public int age;
    public Person(String name){
        this.name=name;
    }
    public boolean equals(Object o){
        if (o instanceof Person){
            Person p = (Person) o;
            return Objects.equals(this.name,p.name) && this.age == p.age;
        }
        return false;
    }
}