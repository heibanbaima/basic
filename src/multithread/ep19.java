package multithread;

public class ep19 {
    private int j;

    public static void main(String[] args) {
        ep19 e = new ep19();
        Inc inc = e.new Inc();
        Dec dec = e.new Dec();
        for (int i=0;i<2;i++){
            Thread t=new Thread(inc);
            t.start();
            t=new Thread(dec);
            t.start();
        }
    }

    private synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName()+"-inc:"+j);
    }
    private synchronized void dec(){
        j--;
        System.out.println(Thread.currentThread().getName()+"-dec:"+j);
    }

    class Inc implements Runnable{
        public void run(){
            for (int i=0;i<100;i++){
                inc();
            }
        }
    }

    class Dec implements Runnable{
        public void run(){
            for (int i=0;i<100;i++){
                dec();
            }
        }
    }

}


