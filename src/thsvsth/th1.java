package thsvsth;

public class th1 {
    void checkAge(int age){
        if(age<18)
            throw new ArithmeticException("Not Eligible for voting");
        else
            System.out.println("Eligible for voting");
    }
    public static void main(String args[]){
        th1 obj = new th1();
        obj.checkAge(13);
        System.out.println("End Of Program");
    }
}
