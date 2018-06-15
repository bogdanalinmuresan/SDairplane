public class OcuppiedTrack implements TrackState {
    @Override
    public String putAirplaneInTrack(Airplane airplane, TrackContext trackContext) {
       if(airplane.status != "LANDED") {

            if (trackContext.getTrack() != null) {
               if (trackContext.getTrack() instanceof OcuppiedTrack) {
                   trackContext.setTrack(new FreeTrack());
                   airplane.status = "TAKEOFF";
                   System.out.println("Airplane-"+airplane.ID+" has take off");
                   return airplane.status;
               }
           }
       }
        return airplane.status;
    }


}
