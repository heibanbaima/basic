package multithread;

public class ep2 {
    //    public static void main(String[] args) {
//        Thread t = new Thread(new MyRunnable());
//        t.start();
//    }
//}
//
//class MyRunnable implements Runnable{
//    @Override
//    public void run(){
//        System.out.println("start new thread!");
//    }
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            System.out.println("Start new Thread!");
        });
        t.start();
    }
}
