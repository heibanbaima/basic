package multithread;

public class ep5 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread1();
        t.start();
        Thread.sleep(10);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class MyThread1 extends Thread{
    public void run(){
        int n = 0;
        while (!isInterrupted()){
            n++;
            System.out.println(n+"Hello!");
        }
    }
}
