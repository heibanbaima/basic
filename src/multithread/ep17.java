package multithread;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ep17 {
    public static void main(String[] args) {
        long[] array=new long[2000];
        long expectedSum=0;
        for (int i=0;i<array.length;i++){
            array[i]=random();
            expectedSum+=array[i];
        }
        System.out.println("Expected sum:"+expectedSum);

        //fork/join
        ForkJoinTask<Long> task=new SumTask(array,0,array.length);
        long startTime=System.currentTimeMillis();
        long result = ForkJoinPool.commonPool().invoke(task);
        long endTime=System.currentTimeMillis();
        System.out.println("Fork/join sum:"+result+"in"+(endTime-startTime)+"ms.");
    }

    static Random random = new Random(0);

    static long random(){
        return random.nextInt(10000);
    }
}

class SumTask extends RecursiveTask<Long>{
    static final int THRESHOLD=500;
    long[] array;
    int start;
    int end;

    SumTask(long[] array,int start,int end){
        this.array=array;
        this.start=start;
        this.end=end;
    }

    @Override
    protected Long compute(){
        if (end - start <= THRESHOLD){
            long sum = 0; //如果任务足够小,直接计算
            for (int i=start;i<end;i++){
                sum+=this.array[i];
                try {
                    Thread.sleep(1);
                }catch (InterruptedException e){} //故意放慢计算速度
            }
            return sum;
        }
        int middle = (end+start)/2;
        System.out.println(String.format("split %d~%d ==> %d~%d,%d~%d",start,end,start,middle,middle,end));
        SumTask subtask1=new SumTask(this.array,start,middle);
        SumTask subtask2=new SumTask(this.array,middle,end);
        invokeAll(subtask1,subtask2); //并行运行两个子任务
        Long subresult1=subtask1.join();
        Long sunresult2=subtask2.join();
        Long result=subresult1+sunresult2;
        System.out.println("result="+subresult1+"+"+sunresult2+"==>"+result);
        return result;
    }
}
