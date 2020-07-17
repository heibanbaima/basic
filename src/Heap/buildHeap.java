package Heap;

public class buildHeap {
    public void buildHeap(int[] a,int n){
        for (int i = n/2; i >=1; --i){
            heapify(a,n,i);
        }
    }

    public void heapify(int[] a,int n,int i){
        while (true){
            int maxPos = i;
            if (i*2 <= n && a[i] < a[i*2]) maxPos = i*2;
            if (i*2+1 <= n && a[maxPos] < a[i*2+1]) maxPos = i*2+1;
            if (maxPos == i) break;
            swap(a,i,maxPos);
            i = maxPos;
        }
    }

    public void swap(int[] a,int b,int c){
        int tmp = a[b];
        a[b] = a[c];
        a[c] = tmp;
    }
}
