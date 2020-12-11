package collections;

import java.util.ArrayList;
import java.util.List;

public class listep3 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("banana");
        for (String s:list){
            System.out.println(s);
        }
    }
}
