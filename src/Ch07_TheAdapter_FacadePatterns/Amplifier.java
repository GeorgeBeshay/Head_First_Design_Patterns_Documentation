package Ch07_TheAdapter_FacadePatterns;

public class Amplifier {
    public void on(){
        System.out.println("Amplifier: on");
    }
    public void off(){
        System.out.println("Amplifier: off");
    }
    public void setStreamingPlayer(){
        System.out.println("Amplifier: setStreamingPlayer");
    }
    public void setStereoSound(){
        System.out.println("Amplifier: setStereoSound");
    }
    public void setSurroundSound(){
        System.out.println("Amplifier: setSurroundSound");
    }
    public void setTuner(){
        System.out.println("Amplifier: setTuner");
    }
    public void setVolume(){
        System.out.println("Amplifier: setVolume");
    }
}
