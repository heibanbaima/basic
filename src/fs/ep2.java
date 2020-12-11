package fs;

public class ep2 {
    public static void main(String[] args) throws Exception{
        Class stdClass = Student.class;
        System.out.println(stdClass.getField("score"));
        System.out.println(stdClass.getField("name"));
        System.out.println(stdClass.getDeclaredField("grade"));
    }
}

class Student extends Person{
    public int score;
    private int grade;
}

class Person{
    public String name;
}
