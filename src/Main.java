
import java.util.ArrayList;
import java.util.Queue;

public class Main{


    public static ArrayList<Airplane> creationAllAirplanes(){
        Airplane airplane;
        ArrayList<Airplane> planes = new ArrayList<>();

        for(int i=0;i<20;i++){
            airplane = new Airplane(i);

                planes.add(i,airplane);
                System.out.println(("Airplane:"+airplane.ID+" Status:"+airplane.status));
        }   return planes;
    }


    public static void main(String[] args) {

        ArrayList<Airplane> allAirplanes = creationAllAirplanes();

        final AirplaneQueue airplaneQueue= new AirplaneQueue();

        final Queue<Airplane> takeoffAirplanes = airplaneQueue.createTakeAirplanes(allAirplanes);

        final Queue<Airplane> landedAirplanes = airplaneQueue.createLandAirplanes(allAirplanes);

        final DrawTracks drawTracks = new DrawTracks();

        drawTracks.createInterface(takeoffAirplanes,landedAirplanes);
     }
}


