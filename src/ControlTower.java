import java.util.HashMap;
import java.util.Map;

public class ControlTower implements IControlTower{

    Map<Integer, IFlyingObject> listOfFlyingObjects = new HashMap<>();
    Map<Integer, Runway> listOfRunways = new HashMap<>();

    Map<Integer, Integer> runwayBookings = new HashMap<>();

    @Override
    public void registerFlyingObject(IFlyingObject flyingObject) {
        if(listOfFlyingObjects.containsKey(flyingObject.getId())){
            System.out.println("Already registered the flying object with the id: "+ flyingObject.getId());
        }
        listOfFlyingObjects.put(flyingObject.getId() ,flyingObject);
    }

    public void registerRunWay(Runway runway) {
        if(listOfRunways.containsKey(runway.getId())){
            System.out.println("Already registered the runway with the id: "+ runway.getId());
        }
        listOfRunways.put(runway.getId(), runway);
    }

    @Override
    public void handleLandingRequest(int time, Runway runway) {
        boolean isBusy;
        for(Map.Entry<Integer, Runway> entry : listOfRunways.entrySet()){
            if(runway.getId() == entry.getKey()){
                isBusy = entry.getValue().isBusy;
                if(isBusy){
                    System.out.println("the runway is busy now, please retry in a few moments");
                } else if (!entry.getValue().isBusy()) {
                    System.out.println("go ahead land on track with id: " + runway.getId());
                }
            }
        }
    }
}
