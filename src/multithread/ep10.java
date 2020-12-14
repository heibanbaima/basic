package multithread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ep10 {
    private final Lock lock=new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private Queue<String> queue=new LinkedList<>();
    public void addTask(String s){
        lock.lock();
        try {
            queue.add(s);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
//    public String getTask(){
//        lock.lock();
//        try {
//            while (queue.isEmpty()){
//                if (condition.await(1,TimeUnit.SECONDS)){}
//                else {}
//            }
//            return queue.remove();
//        }finally {
//            lock.unlock();
//        }
//    }
}
