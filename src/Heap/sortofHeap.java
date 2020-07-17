package Heap;

public class sortofHeap {

    public void sort(int[] a,int n){
        buildHeap bh = new buildHeap();
        bh.buildHeap(a, n);
        int k = n;
        while (k > 1){
            bh.swap(a,1,k);
            --k;
            bh.heapify(a,k,1);
        }
    }

}
