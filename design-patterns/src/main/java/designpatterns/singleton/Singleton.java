package designpatterns.singleton;

// Singleton Class
/*
*   Static in nature
*   Thread safe
*   Private Constructor
*   Private Instance of Class
*   No parameter to the constructor
*/
public class Singleton {

    private static volatile Singleton instance = null;  // Thread-safe
    private Singleton() {       // Private Constructor with no params
    }

    public static Singleton getInstance () {
        if(instance == null) {
            synchronized (Singleton.class) {      // Thread safe, no multi-threading
                if(instance == null) {          // Double-checking
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
