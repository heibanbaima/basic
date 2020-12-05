package constructors;

// Java Program to illustrate constructor overloading using same task (addition operation ) for different types of arguments.
class ep3 {
    // constructor with one argument
    ep3(String name)
    {
        System.out.println("Constructor with one argument - String : " + name);
    }

    // constructor with two arguments
    ep3(String name, int age)
    {

        System.out.println("Constructor with two arguments : String and Integer : " + name + " "+ age);

    }

    // Constructor with one argument but with different type than previous..
    ep3(long id)
    {
        System.out.println("Constructor with one argument : Long : " + id);
    }
}

class GFG3 {
    public static void main(String[] args) {
        // Creating the objects of the class named 'Geek' by passing different arguments

        // Invoke the constructor with one argument of type 'String'.
        ep3 geek3 = new ep3("Shikhar");

        // Invoke the constructor with two arguments
        ep3 geek4 = new ep3("Dharmesh", 26);

        // Invoke the constructor with one argument of type 'Long'.
        ep3 geek5 = new ep3(325614567);
    }
}
