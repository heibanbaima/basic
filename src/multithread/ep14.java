package multithread;

import java.util.concurrent.CompletableFuture;

public class ep14 {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Double> cf = CompletableFuture.supplyAsync(ep14::fetchPrice); //创建异步执行任务
        cf.thenAccept((result)->{
            System.out.println("price:"+result);
        }); //如果执行成功
        cf.exceptionally((e)->{
            e.printStackTrace();
            return null;
        }); //如果执行异常
        Thread.sleep(200); //主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭
    }

    static Double fetchPrice(){
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){}
        if (Math.random()<0.3){
            throw new RuntimeException("fetch price failed!");
        }
        return 5+Math.random()*20;
    }
}
