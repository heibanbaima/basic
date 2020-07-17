package Heap;

public class HeapofRemove {
    private int[] a;
    private int n;
    private int count;

    public void removeMax(){
        if (count == 0) return ;
        a[1] = a[count];
        --count;
        heapify(a,count,1);
    }

    private void heapify(int[] a,int n,int i){ //自上往下堆化
        while (true){
            int maxPos = i;
            if (i*2 <= n && a[i] < a[i*2]) maxPos = i*2;
            if (i*2+1 <= n && a[maxPos] < a[i*2+1]) maxPos = i*2+1;
            if (maxPos == i) break;
            swap(a,i,maxPos);
            i = maxPos;
        }
    }

    private void swap(int[] a,int b,int c){
        int tmp = a[b];
        a[b] = a[c];
        a[c] = tmp;
    }

}
