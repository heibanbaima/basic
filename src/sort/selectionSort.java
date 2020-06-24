package sort;

public class selectionSort {
    public static void selectionSort(int[] a,int n){
        if (n<=1) return;
        for (int i = 0;i<n-1;++i){
            int minIndex = i;
            for (int j = i+1;j<n;j++){
                if (a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }
}
