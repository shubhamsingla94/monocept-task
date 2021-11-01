package designpatterns.singleton;

public class SingletonExample {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton secondInstance = Singleton.getInstance();
        System.out.println(secondInstance);

        // Output- same instance, now we can say that was Singleton class
    }
}
