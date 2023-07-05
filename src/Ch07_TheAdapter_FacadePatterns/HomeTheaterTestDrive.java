package Ch07_TheAdapter_FacadePatterns;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {

        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner,
                player, projector, lights, screen, popper);

        homeTheaterFacade.watchMovie("Olympus Has Fallen");
    }
}
