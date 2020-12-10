package fx;

public class ep5 {

    //对参数List<? extends Integer>进行只读的方法。

    int sunOfList(List<? extends Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer n = list.get(i);
            sum = sum + n;
        }
        return sum;
    }
}

interface List<T> {
    int size();

    T get(int index);

    void add(T t);

    void remove(T t);
}
