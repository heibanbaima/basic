package sync;

public class syc {
    synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyThread3 extends Thread{
    syc t;
    MyThread3(syc t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread4 extends Thread{
    syc t;
    MyThread4(syc t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

class TestSynchronization2{
    public static void main(String args[]){
        syc obj = new syc();//only one object
        MyThread3 t1=new MyThread3(obj);
        MyThread4 t2=new MyThread4(obj);
        t1.start();
        t2.start();
    }
}
