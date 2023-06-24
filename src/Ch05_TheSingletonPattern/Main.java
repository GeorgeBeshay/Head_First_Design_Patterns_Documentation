package Ch05_TheSingletonPattern;

public class Main extends Thread{
    public static void main(String[] args) {
        /*
         * Run the code and notice that the 2 objects would be printed not only 1.
         * This problem destroys the singleton pattern objective.
         * PS: In case the same object was printed, run it multiple time.
         */
        for(int i = 0 ; i < 10 ; i++)
            (new Main()).start();
    }

    @Override
    public void run(){
//        System.out.println(Singleton.getInstance().hashCode());
        System.out.println(SignletonEnum.UNIQUE_INSTANCE.get().hashCode());
    }
}
