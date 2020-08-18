package Dynamic;

public class backtracking0_1 {
    public static void main(String[] args){
        backtracking0_1 bt = new backtracking0_1();
        bt.f(0,0);
    }
    private int maxW = Integer.MIN_VALUE;
    private int[] weight = {2,2,4,6,3};
    private int n = 5; //物品个数
    private int w = 9; //背包承受的最大重量
    public void f(int i, int cw){
        if (cw == w || i == n){
            if (cw > maxW) maxW = cw;
            return;
        }
        f(i+1,cw);
        if (cw + weight[i] <= w){
            f(i+1,cw + weight[i]);
        }
    }
}
