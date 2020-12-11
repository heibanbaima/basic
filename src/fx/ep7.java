package fx;

public class ep7 {
    public static void main(String[] args){
        Pair2<Integer> p = new Pair2<>(123,456);
        Pair2<?> p2=p;
        System.out.println(p2.getFirst()+","+p2.getLast());
    }
}

class Pair2<T>{
    private T first;
    private T last;

    public Pair2(T first,T last){
        this.first=first;
        this.last=last;
    }

    public T getFirst(){
        return first;
    }

    public T getLast(){
        return last;
    }
    public void setFirst(T first){
        this.first=first;
    }

    public void setLast(T last) {
        this.last = last;
    }
}
