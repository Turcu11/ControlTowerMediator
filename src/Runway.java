public class Runway {
    int id;
    int runwayNumber;
    boolean isBusy;

    public Runway(int id, int runwayNumber, boolean isBusy){
        this.id = id;
        this.runwayNumber = runwayNumber;
        this.isBusy = isBusy;
    }

    public int getId() {
        return id;
    }

    public int getRunwayNumber() {
        return runwayNumber;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }
}
