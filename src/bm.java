public class bm {
    private static final int SIZE = 256;

    public int bm(char[] a, int n, char[] b,int m){
        int[] bc = new int[SIZE];
        generateBC(b,m,bc);
        int i = 0;
        while (i < n-m){
            int j;
            for (j = m-1; j >= 0; j--){
                if (a[i+j] != b[j]) break; //坏字符对应模式串中的下标是j
            }
            if (j < 0) return i;
            i = i + (j - bc[(int)a[i+j]]);
        }
        return -1;
    }

    private void generateBC(char[] b,int m,int[] bc){
        for (int i = 0; i < SIZE; i++){
            bc[i] = -1;
        }
        for (int i = 0; i < m; i++){
            int ascii = (int)b[i];
            bc[ascii] = i;
        }
    }
}
