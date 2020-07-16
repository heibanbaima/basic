package treeofrecursion;

public class printPermutations {
    //k表示要处理的子数组的数据个数
    public void printPermutations(int[] data, int n, int k){
        if (k == 1){
            for (int i = 0; i < n; i++){
                System.out.print(data[i]+" ");
            }
            System.out.println();
        }

        for (int i = 0;i < k; i++){
            int tmp = data[i];
            data[i] = data[k-1];
            data[k-1] = tmp;

            printPermutations(data,n,k-1);

            tmp = data[i];
            data[i] = data[k-1];
            data[k-1] = tmp;
        }
    }

    public static void main(String[] args){
        int[] data = {1,2,3};
        printPermutations pp = new printPermutations();
        pp.printPermutations(data,3,3);
    }
}
