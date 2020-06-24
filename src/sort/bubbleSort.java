package sort;

public class bubbleSort {
    public void bubbleSort(int[] a ,int n){
        if (n<=1) return;

        for (int i = 0;i < n;i++){
            boolean flag = false;
            for (int j = 0;j<n-1-i;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
}
