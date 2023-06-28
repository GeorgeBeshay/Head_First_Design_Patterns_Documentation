package Ch06_TheCommandPattern;

import javax.crypto.Mac;
import java.sql.Array;

public class RemoteControlTest {

    public static void main(String[] args) {
       RemoteControl remoteControl = new RemoteControl();

       Light light = new Light();
       Stereo stereo = new Stereo();

       LightOnCommand lightOnCommand = new LightOnCommand(light);
       LightOffCommand lightOffCommand = new LightOffCommand(light);
       StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
       StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

//       remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
//       remoteControl.setCommand(0, () -> light.on(), () -> light.off()); // Or using lambda expressions

//       remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);
//       remoteControl.setCommand(1, () -> {
//          stereo.on();
//          stereo.setCd();
//          stereo.setVolume(11);
//       }, () -> stereo.off());


//        System.out.println(remoteControl);

//       remoteControl.onButtonWasPushed(0);
//       System.out.println(remoteControl);

//       remoteControl.offButtonWasPushed(0);
//       System.out.println(remoteControl);

//       remoteControl.onButtonWasPushed(1);
//       System.out.println(remoteControl);

//       remoteControl.offButtonWasPushed(1);
//       System.out.println(remoteControl);

       // Ceiling Fan
       CeilingFan ceilingFan = new CeilingFan("Living Room");
       CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
       CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
       CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

//       remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
//       remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
//
//       remoteControl.onButtonWasPushed(0);
//       remoteControl.offButtonWasPushed(0);
//       System.out.println(remoteControl);
//       remoteControl.undoButtonWasPushed();
//
//       remoteControl.onButtonWasPushed(1);
//       System.out.println(remoteControl);
//       remoteControl.undoButtonWasPushed();

       // Macro Commands
       MacroCommand partyOnMacro = new MacroCommand(new Command[] {lightOnCommand,
               stereoOnWithCDCommand, ceilingFanHighCommand});
       MacroCommand partOffMacro = new MacroCommand(new Command[] {lightOffCommand,
               stereoOffCommand, ceilingFanOffCommand});
       remoteControl.setCommand(0, partyOnMacro, partOffMacro);

       System.out.println(remoteControl);
       System.out.println("-------- Pushing Macro On --------");
       remoteControl.onButtonWasPushed(0);
       System.out.println("-------- Pushing Macro Off --------");
       remoteControl.offButtonWasPushed(0);

    }

}
