package Ch06_TheCommandPattern;

public class RemoteControlTest {

    public static void main(String[] args) {
       RemoteControl remoteControl = new RemoteControl();

       Light light = new Light();
       Stereo stereo = new Stereo();

       LightOnCommand lightOnCommand = new LightOnCommand(light);
       LightOffCommand lightOffCommand = new LightOffCommand(light);
       StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
       StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

       remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
       remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);

       remoteControl.onButtonWasPushed(0);
       remoteControl.offButtonWasPushed(0);
       remoteControl.onButtonWasPushed(1);
       remoteControl.offButtonWasPushed(1);
    }

}
