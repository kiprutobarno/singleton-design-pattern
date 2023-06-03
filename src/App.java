public class App {
    public static void main(String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        System.out.println("Singleton Instance: " + instance.hashCode());
    }
}
