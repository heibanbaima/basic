package Heap;

public class HeapofInsert {
    private int[] a; //数组，从下标1开始存储数据
    private int n;
    private int count; //堆中已经存储的数据个数

    public HeapofInsert(int capacity){
        a = new int[capacity+1];
        n = capacity;
        count = 0;
    }

    public void insert(int data){
        if (count >= n) return;
        ++count;
        a[count] = data;
        int i = count;
        while (i/2 > 0 && a[i] > a[i/2]){ //自下往上堆化
            swap(a,i,i/2);
            i = i/2;
        }
    }

    public void swap(int[] a,int b,int c){
        int tmp = a[b];
        a[b] = a[c];
        a[c] = tmp;
    }
}
