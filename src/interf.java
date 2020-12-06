public class interf {
    public static void main(String[] args) {
        Personi p = new Studenti("Xiao Ming");
        p.run();
    }
}

interface Personi {
    String getName();

    default void run() {
        System.out.println(getName() + " run");
    }
}

class Studenti implements Personi {
    private String name;

    public Studenti(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}