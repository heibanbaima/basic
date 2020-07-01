package sort;

import java.util.Arrays;

public class BucketSort {
    public static void bucketSort(int[] arr,int bucketSize){
        if(arr.length<2){
            return;
        }

        //找出数组中的最小与最大值
        int minValue = arr[0];
        int maxValue = arr[1];
        for (int i = 0;i < arr.length;i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }else if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }

        int bucketCount = (maxValue-minValue)/bucketSize+1;
        int[][] buckets = new int[bucketCount][bucketSize];
        //桶内数据个数
        int[] indexArr = new int[bucketCount];

        for (int i = 0;i<arr.length;i++){
            int bucketIndex = (arr[i]-minValue)/bucketSize;
            if(indexArr[bucketIndex] == buckets[bucketIndex].length){
                //数组扩容
                ensureCapacity(buckets,bucketIndex);
            }
            buckets[bucketIndex][indexArr[bucketIndex]++] = arr[i];
        }

        //使用快排对每个桶进行排序
        int k = 0;
        for (int i = 0;i < buckets.length;i++){
            if (indexArr[i] == 0){
                continue;
            }
            quickSortC(buckets[i],0,indexArr[i]-1);
            for (int j = 0;j < indexArr[i];j++){
                arr[k++] = buckets[i][j];
            }
        }
    }

    private static void ensureCapacity(int[][] buckets,int bucketIndex){
        int[] tempArr = buckets[bucketIndex];
        int[] newArr = new int[tempArr.length*2];
        for (int j = 0;j < tempArr.length;j++){
            newArr[j] = tempArr[j];
        }
        buckets[bucketIndex] = newArr;
    }

    private static void quickSortC(int[] arr,int p,int r){
        if(p>=r){
            return;
        }

        int q = partition(arr,p,r);
        quickSortC(arr,p,q-1);
        quickSortC(arr,q+1,r);
    }

    private static int partition(int[] arr,int p,int r){
        int pivot = arr[r];
        int i = p;
        for (int j = p;j < r;j++){
            if (arr[j]<=pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,r);
        return i;
    }

    private static void swap(int[] arr,int i,int j){
        if(i==j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = {22,5,11,41,45,26,29,10,7,8,30,27,42,43,40};
        bucketSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
