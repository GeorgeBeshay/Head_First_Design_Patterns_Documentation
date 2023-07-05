package Ch07_TheAdapter_FacadePatterns;

public class StreamingPlayer {
    public void on(){
        System.out.println("Streaming Player is on ..");
    }
    public void off(){
        System.out.println("Streaming Player is off ..");
    }
    public void pause(){
        System.out.println("Streaming Player: pause ..");
    }
    public void play(){
        System.out.println("Streaming Player: play ..");
    }
    public void setSurroundAudio(){
        System.out.println("Streaming Player: set surround audio ..");
    }
    public void setTwoChannelAudio(){
        System.out.println("Streaming Player: set two channel audio ..");
    }
    public void stop(){
        System.out.println("Streaming Player: stop ..");
    }
}
