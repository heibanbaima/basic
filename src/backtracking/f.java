package backtracking;

public class f {
    public int maxW = Integer.MIN_VALUE; //存储背包中物品总重量的最大值

    //cw：当前已经装进去的物品的重量和
    //i：考察到哪个物品了
    //假设背包可承受重量100，物品个数10，物品重量存储在数组a中，那可以这样调用函数：
    //f(0,0,a,10,100)
    public void f(int i, int cw, int[] items, int n, int w) {
        if (cw == w || i == n) {
            if (cw > maxW) maxW = cw;
            return;
        }
        f(i + 1, cw, items, n, w);
        if (cw + items[i] <= w) {
            f(i + 1, cw + items[i], items, n, w);
        }
    }
}