public interface IControlTower {

    void registerFlyingObject(IFlyingObject flyingObject);
    void registerRunWay(Runway runway);

    void handleLandingRequest(int time, Runway runway);

}
