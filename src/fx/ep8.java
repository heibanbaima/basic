package fx;

//利用可变参数创建泛型数组T[]

public class ep8 {
    @SafeVarargs
    static <T> T[] asArray(T... objs) {
        return objs;
    }

    String[] ss = ep8.asArray("a", "b", "c");
    Integer[] ns = ep8.asArray(1, 2, 3);
}
