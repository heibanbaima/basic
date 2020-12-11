package collections;

import java.util.ArrayList;
import java.util.List;

public class listep4 {
    //调用toArray()方法直接返回一个Object[]数组；
//    public static void main(String[] args){
//        List<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("pear");
//        list.add("banana");
//        Object[] array = list.toArray();
//        for (Object s:array){
//            System.out.println(s);
//        }
//    }

    //给toArray(T[])传入一个类型相同的Array,List内部自动把元素复制到传入的Array中。
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(56);
        Integer[] array = list.toArray(new Integer[3]);
        for (Integer n:array){
            System.out.println(n);
        }
    }
}
