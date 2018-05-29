

public class FreeTrack implements TrackState{

    @Override
    public void putAirplaneInTrack(TrackContext trackContext) {
        if (trackContext.getTrack1()!=null){
            if (trackContext.getTrack1() instanceof FreeTrack)
                trackContext.setTrack1(new OcuppiedTrack());
        }

        if (trackContext.getTrack2()!=null){
            if (trackContext.getTrack2() instanceof FreeTrack)
                trackContext.setTrack2(new OcuppiedTrack());
        }
        if (trackContext.getTrack3()!=null){
            if (trackContext.getTrack3() instanceof FreeTrack)
                trackContext.setTrack3(new OcuppiedTrack());
        }
    }
}
