package constructors;

// Java Program to illustrate calling of parameterized constructor.
class ep2 {
    // data members of the class.
    String name;
    int id;

    // constructor would initialize data members with the values of passed arguments while object of that class created.
    ep2(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}

class GFG2
{
    public static void main (String[] args)
    {
        // this would invoke the parameterized constructor.
        ep2 geek2 = new ep2("adam", 1);
        System.out.println("GeekName :" + geek2.name +
                " and GeekId :" + geek2.id);
    }
}
