package Ch06_TheCommandPattern;

public class LightOnCommand implements Command{

    private final Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
