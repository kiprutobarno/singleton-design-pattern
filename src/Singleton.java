
//Eager Initialization

public class Singleton {

    private static final Singleton instance = new Singleton();

    // private constructor to prevent client applications using the constructor
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
