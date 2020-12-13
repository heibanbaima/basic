package multithread;

public class ep6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread2();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class MyThread2 extends Thread{
    public void run(){
        Thread hello = new HelloThread();
        hello.start();
        try {
            hello.join();
        }catch (InterruptedException e){
            System.out.println("interrupted!");
        }
        hello.interrupt();
    }
}

class HelloThread extends Thread{
    public void run(){
        int n = 0;
        while (!isInterrupted()){
            n++;
            System.out.println(n+"hello!");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                break;
            }
        }
    }
}
