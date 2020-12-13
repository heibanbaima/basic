package multithread;

public class ep1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Start new thread!");
    }
}