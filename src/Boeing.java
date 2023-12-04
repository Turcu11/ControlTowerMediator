public class Boeing implements IFlyingObject {

    private int id;
    private boolean isInAir = false;
    private boolean isOnGround = false;
    private boolean isOnRunWay = false;
    private IControlTower controlTower;
    private int timeToLand;
    private int timeToTakeOff;
    private Clock clock;

    public Boeing(int id, boolean isInAir, IControlTower controlTower, Clock clock){
        this.id = id;
        this.isInAir = isInAir;
        if(!isInAir){
            this.isOnGround = true;
        }
        this.controlTower = controlTower;
        this.clock = clock;
    }

    public int getTime(){
        return this.clock.getCurrentTime();
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public boolean isInAir() {
        return this.isInAir;
    }

    @Override
    public boolean isOnGround() {
        return this.isOnGround;
    }

    @Override
    public boolean isOnRunway() {
        return this.isOnRunWay;
    }

    @Override
    public void requestLandingPermission(int time, Runway runway) {
        controlTower.handleLandingRequest(time, runway);
    }


    @Override
    public void land() {

    }

    @Override
    public void requestTakeOffPermission() {

    }

    @Override
    public void takeOff() {

    }
}
