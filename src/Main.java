
import java.util.ArrayList;
import java.util.Queue;

public class Main{

public static void main(String[] args) {

        final AirplaneQueue airplaneQueue= new AirplaneQueue();

        final ArrayList<Airplane> allAirplanes = airplaneQueue.creationAllAirplanes();

        final Queue<Airplane> takeoffAirplanes = airplaneQueue.createTakeAirplanes(allAirplanes);

        final Queue<Airplane> landedAirplanes = airplaneQueue.createLandAirplanes(allAirplanes);

        final DrawTracks drawTracks = new DrawTracks();

        drawTracks.createInterface(takeoffAirplanes,landedAirplanes);
     }
}


