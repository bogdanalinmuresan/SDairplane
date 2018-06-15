import java.util.ArrayList;
import java.util.LinkedList;

public class AirplaneQueue {

   public static java.util.Queue<Airplane> createLandAirplanes(ArrayList<Airplane> allAirplane){

        java.util.Queue<Airplane> landingPlanes= new LinkedList<>();

        for (Airplane airplane: allAirplane) {
            if(airplane.status == "LANDED"){
                landingPlanes.add(airplane);
            }
        }
        return landingPlanes;
    }

    public static java.util.Queue<Airplane> createTakeAirplanes(ArrayList<Airplane> allAirplane){
        java.util.Queue<Airplane> takingOffPlanes = new LinkedList<>();

        for (Airplane airplane: allAirplane) {
            if(airplane.status == "TAKEOFF")
                takingOffPlanes.add(airplane);
        }
        return takingOffPlanes;
    }
}
