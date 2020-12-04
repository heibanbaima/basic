package sync;

public class nonsyc {
    void printTable(int n){//method not synchronized
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyThread1 extends Thread{
    nonsyc t;
    MyThread1(nonsyc t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread2 extends Thread{
    nonsyc t;
    MyThread2(nonsyc t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

class TestSynchronization1{
    public static void main(String args[]){
        nonsyc obj = new nonsyc();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
