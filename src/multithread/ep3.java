package multithread;

public class ep3 {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread(){
            public void run() {
                System.out.println("thread run...");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){}
                System.out.println("thread end.");
            }
        };
        t.start();
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){}
        System.out.println("main end...");
    }
}
