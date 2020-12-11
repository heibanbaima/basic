package collections;

import java.util.ArrayList;
import java.util.List;

public class listep1 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("apple");
        System.out.println(list.size());
    }
}
