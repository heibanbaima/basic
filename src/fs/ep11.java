package fs;

//获取父类的Class
public class ep11 {
    public static void main(String[] args)throws Exception{
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());
    }
}
