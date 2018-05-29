

public class TrackContext {

    private TrackState track1;
    private TrackState track2;
    private TrackState track3;

    //constructors
    public TrackContext(){

        this.track1=new FreeTrack();
        this.track2=new FreeTrack();
        this.track3=new FreeTrack();
    }

    public void wantToPlane(Airplane airplane){
        try{
            track1.putAirplaneInTrack(this);
            track2.putAirplaneInTrack(this);
            track3.putAirplaneInTrack(this);
        }catch (Exception e){

        }
    }

    public TrackState getTrack1() {
        return track1;
    }

    public void setTrack1(TrackState track1) {
        this.track1 = track1;
    }

    public TrackState getTrack2() {
        return track2;
    }

    public void setTrack2(TrackState track2) {
        this.track2 = track2;
    }

    public TrackState getTrack3() {
        return track3;
    }

    public void setTrack3(TrackState track3) {
        this.track3 = track3;
    }

/*
    public static String randomStatus(){
        int random = (int) Math.round(Math.random());
        if(random == 1){
            return "TAKEOFF";
        }else{
            return "LANDING";
        }
    }
*/



/*    public static void main(String [] args){
        String status = randomStatus();
        int id = 0;

        Airplane airplane=new Airplane(status,id);

        FreeTrack freeTrack=new FreeTrack();
        freeTrack.doAction(airplane);


    }
*/

}



/*        |   |   |   |
        |   |   |   |
        |   |   |   |
        |   |   |   |
        |   |   |   |
                            Queu - Y Y Y Y Y Y
*/

