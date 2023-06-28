package Ch06_TheCommandPattern;

public class StereoOffCommand implements Command{

    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.off();
    }

    public void undo(){
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

}
