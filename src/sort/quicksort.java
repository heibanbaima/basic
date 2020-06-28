package sort;

import java.util.Arrays;

public class quicksort {
    public static void quickSort(int[] a,int n){
        quickSortInternally(a,0,n-1);
    }

    private static void quickSortInternally(int[] a,int p,int r){
        if (p>=r) return;
        int q= partition(a,p,r);
        quickSortInternally(a,p,q-1);
        quickSortInternally(a,q+1,r);
    }

    private static int partition(int[] a,int p,int r){
        int pivot = a[r];
        int i = p;
        for (int j = p;j<r;++j){
            if(a[j]<pivot){
                if (i == j){
                    ++i;
                }else {
                    int tmp = a[i];
                    a[i++] = a[j];
                    a[j] = tmp;
                }
            }
        }
        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;
        return i;
    }

    public static void main(String[] args){
        int[] a = {6,8,7,6,3,5,9,4};
        int n = a.length;
        quickSort(a,n);
        System.out.println(Arrays.toString(a));
    }
}
