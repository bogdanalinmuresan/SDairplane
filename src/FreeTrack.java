

public class FreeTrack implements TrackState{


    @Override
    public String putAirplaneInTrack(Airplane airplane, TrackContext trackContext) {

        if (trackContext.getTrack()!=null){
            if (trackContext.getTrack() instanceof FreeTrack){
                trackContext.setTrack(new OcuppiedTrack());
                if(airplane.status == "TAKEOFF"){
                    airplane.status= "TAKEOFF";
                    System.out.println("Airplane-"+airplane.ID+" is taking off from track-"+trackContext.getID());
                }else{
                    airplane.status= "LANDED";
                    System.out.println("Airplane-"+airplane.ID+" is landing from track-"+trackContext.getID());
                }
                return airplane.status;
            }
        }return airplane.status;

    }
}
