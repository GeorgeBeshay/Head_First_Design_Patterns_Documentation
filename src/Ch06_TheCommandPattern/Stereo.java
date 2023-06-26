package Ch06_TheCommandPattern;

public class Stereo {

    public void on(){
        System.out.println("Stereo is on ..");
    }

    public void off(){
        System.out.println("Stereo is off ..");
    }

    public void setCd(){
        System.out.println("Stereo set cd ..");
    }

    public void setDvd(){
        System.out.println("Stereo set Dvd ..");
    }

    public void setRadio(){
        System.out.println("Stereo set radio ..");
    }

    public void setVolume(int vol){
        System.out.println("Stereo set volume to " + vol);
    }

}
