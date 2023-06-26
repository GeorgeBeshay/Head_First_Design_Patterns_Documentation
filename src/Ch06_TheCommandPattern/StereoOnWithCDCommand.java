package Ch06_TheCommandPattern;

public class StereoOnWithCDCommand implements Command{

    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

}
