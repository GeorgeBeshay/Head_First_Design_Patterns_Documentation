package Ch06_TheCommandPattern;

public class LightOffCommand implements Command{

    private final Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}
