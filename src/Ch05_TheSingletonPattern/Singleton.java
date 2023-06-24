package Ch05_TheSingletonPattern;

public class Singleton {

    private Singleton(){}

//     Option #0, bad for multithreading
//    private static Singleton uniqueInstance;
//    public static Singleton getInstance(){
//        if(uniqueInstance == null)
//            uniqueInstance = new Singleton();
//        return uniqueInstance;
//    }

    // Option #1, synchronization is expensive, and represents an overhead.
//    private static Singleton uniqueInstance;
//    public synchronized static Singleton getInstance(){
//        if(uniqueInstance == null)
//            uniqueInstance = new Singleton();
//        return uniqueInstance;
//    }

    // Option #2, Eager Creation
//    private static Singleton uniqueInstance = new Singleton();
//    public static Singleton getInstance(){
//        return uniqueInstance;
//    }

    // Option #3, Double-checked locking
    private volatile static Singleton uniqueInstance;
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            // to acquire the lock associated with the Singleton class (class level synchronization)
            // notice that X.class, uses the class instance as a monitor (recall what is monitor ??)
            synchronized (Singleton.class) {
                if (uniqueInstance == null)
                    uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
}
