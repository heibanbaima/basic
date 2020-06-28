package sort;

public class mergeBySentry {
    public static void mergeBySentry(int[] arr,int p,int q,int r){
        int[] leftArr = new int[q-p+2];
        int[] rightArr = new int[r-q+1];

        for (int i=0;i<=q-p;i++){
            leftArr[i] = arr[p+i];
        }

        //第一个数组添加哨兵（最大值）
        leftArr[q-p+1] = Integer.MAX_VALUE;

        for (int i = 0;i<r-q;i++){
            rightArr[i] = arr[q+1+i];
        }

        //第二个数组添加哨兵（最大值）
        rightArr[r-q] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        int k = p;
        while (k<=r){
            //
        }
    }
}
