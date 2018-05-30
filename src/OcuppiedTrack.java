public class OcuppiedTrack implements TrackState {
    @Override
    public boolean putAirplaneInTrack(Airplane airplane, TrackContext trackContext) {
       if(airplane.status != "TAKEOFF") {

            if (trackContext.getTrack() != null) {
               if (trackContext.getTrack() instanceof OcuppiedTrack) {
                   trackContext.setTrack(new FreeTrack());
                   airplane.status = "TAKEOFF";
                   return false;
               }
           }
       }
        /*if (trackContext.getTrack2()!=null){
            if (trackContext.getTrack2() instanceof OcuppiedTrack){
                trackContext.setTrack2(new FreeTrack());
                this.status2="OCCUPIED";
            }
        }
        if (trackContext.getTrack3()!=null){
            if (trackContext.getTrack3() instanceof OcuppiedTrack){
                trackContext.setTrack3(new FreeTrack());
                this.status3="OCCUPIED";
            }
        }*/

        return false;
    }


}
