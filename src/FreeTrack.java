

public class FreeTrack implements TrackState{


    @Override
    public boolean putAirplaneInTrack(Airplane airplane, TrackContext trackContext) {

        if (trackContext.getTrack()!=null){
            if (trackContext.getTrack() instanceof FreeTrack){
                trackContext.setTrack(new OcuppiedTrack());
                airplane.status= "LANDED";
                return true;
            }
        }return false;

        /*if (trackContext.getTrack2()!=null){
            if (trackContext.getTrack2() instanceof FreeTrack){
                trackContext.setTrack2(new OcuppiedTrack());
                this.status2="FREE";
            }
        }
        if (trackContext.getTrack3()!=null){
            if (trackContext.getTrack3() instanceof FreeTrack){
                trackContext.setTrack3(new OcuppiedTrack());
                this.status3="FREE";
            }
        }*/
    }
}
