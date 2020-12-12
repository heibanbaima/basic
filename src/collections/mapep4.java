package collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class mapep4 {
    public static void main(String[] args) {
        Map<Person2, Integer> map = new TreeMap<>(new Comparator<Person2>() {
            @Override
            public int compare(Person2 o1, Person2 o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        map.put(new Person2("Tom"), 1);
        map.put(new Person2("Bob"), 2);
        map.put(new Person2("Lily"), 3);
        for (Person2 key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get(new Person2("Bob")));
    }
}

class Person2 {
    public String name;

    Person2(String name) {
        this.name = name;
    }

    public String toString() {
        return "{Person:" + name + "}";
    }
}