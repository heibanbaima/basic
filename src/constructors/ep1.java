package constructors;

// Java Program to illustrate calling a no-argument constructor
class ep1 {
    int num;
    String name;

    // this would be invoked while an object of that class is created.
    ep1()
    {
        System.out.println("Constructor called");
    }
}

class GFG1
{
    public static void main (String[] args)
    {
        // this would invoke default constructor.
        ep1 geek1 = new ep1();

        // Default constructor provides the default values to the object like 0, null
        System.out.println(geek1.name);
        System.out.println(geek1.num);
    }
}
