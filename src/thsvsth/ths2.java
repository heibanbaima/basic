package thsvsth;

import java.io.IOException;

public class ths2 {
    void myMethod(int num)throws IOException, ClassNotFoundException{
        if(num==1)
            throw new IOException("IOException Occurred");
        else
            throw new ClassNotFoundException("ClassNotFoundException");
    }
}

class Example1{
    public static void main(String args[]){
        try{
            ths2 obj=new ths2();
            obj.myMethod(1);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
