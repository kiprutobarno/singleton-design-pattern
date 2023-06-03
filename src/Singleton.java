
//Eager Initialization

public class Singleton {

    private static Singleton instance;

    // private constructor to prevent client applications using the constructor
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
