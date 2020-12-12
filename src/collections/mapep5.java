package collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class mapep5 {
    public static void main(String[] args) {
        Map<Student1, Integer> map = new TreeMap<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                if (o1.score == o2.score) {
                    return 0;
                }
                return o1.score > o2.score ? -1 : 1;
            }
        });
        map.put(new Student1("Tom", 77), 1);
        map.put(new Student1("Bob", 66), 2);
        map.put(new Student1("Lily", 99), 3);
        for (Student1 key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get(new Student1("Bob", 66)));
    }
}

class Student1 {
    public String name;
    public int score;

    Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return String.format("{%s:score=%d}", name, score);
    }
}
