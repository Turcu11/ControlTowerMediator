public interface IFlyingObject {
    int getId();
    boolean isInAir();
    boolean isOnGround();
    boolean isOnRunway();

    void requestLandingPermission(int time, Runway runway);

    void land();
    void requestTakeOffPermission();
    void takeOff();
}
