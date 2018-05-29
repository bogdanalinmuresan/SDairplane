public class OcuppiedTrack implements TrackState {

    @Override
    public void putAirplaneInTrack(TrackContext trackContext) {
       if (trackContext.getTrack1()!=null){
            if (trackContext.getTrack1() instanceof OcuppiedTrack)
                trackContext.setTrack1(new FreeTrack());
        }

        if (trackContext.getTrack2()!=null){
            if (trackContext.getTrack2() instanceof OcuppiedTrack)
                trackContext.setTrack2(new FreeTrack());
        }
        if (trackContext.getTrack3()!=null){
            if (trackContext.getTrack3() instanceof OcuppiedTrack)
                trackContext.setTrack3(new FreeTrack());
        }


    }


}
