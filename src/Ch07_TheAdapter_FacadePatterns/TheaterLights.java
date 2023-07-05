package Ch07_TheAdapter_FacadePatterns;

public class TheaterLights {
    public void on(){
        System.out.println("Theater Lights on ..");
    }
    public void off(){
        System.out.println("Theater Lights off ..");
    }
    public void dim(int x){
        System.out.println("Lights dim = " + x);
    }
}
