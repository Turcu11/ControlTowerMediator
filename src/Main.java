public class Main {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        ControlTower controlTower = new ControlTower();
        Runway track = new Runway(1, 1, false);
        Runway track2 = new Runway(2, 2, true);

        clock.start(); //here I start the clock it's currently keeping only seconds, like the UNIX timestamp

        Boeing boeing1 = new Boeing(1, false, controlTower, clock);
        Boeing boeing2 = new Boeing(2, true, controlTower, clock);
        Boeing boeing3 = new Boeing(3, false, controlTower, clock);

        controlTower.registerFlyingObject(boeing1);
        controlTower.registerFlyingObject(boeing2);
        controlTower.registerFlyingObject(boeing3);
        controlTower.registerRunWay(track);
        controlTower.registerRunWay(track2);

        boeing1.requestLandingPermission(10, track2);
    }
}