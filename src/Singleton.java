
//Threadsafe Singleton

public class Singleton {

    private static Singleton instance;

    // private constructor to prevent client applications using the constructor
    private Singleton() {
    }

    // get instance using double locking
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
}
