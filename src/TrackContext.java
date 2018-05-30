import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TrackContext {

    private TrackState trackState;
    private int ID;

    //constructors
    public TrackContext(int ID){

        this.trackState=new FreeTrack();
        this.ID=ID;

    }

    /*public TrackContext wantToPlane(Airplane airplane,TrackContext track){
        String status = "";
        try{

            //track.putAirplaneInTrack(this);
            if(trackState.putAirplaneInTrack(this)){
                status = "LANDED on Track1";
                return status;
            }else{

            status = "This track is occupied";
            return status;
            }
        }catch (Exception e){
            return null;
        }
    }*/

    public TrackState getTrack() {
        return trackState;
    }

    public void setTrack(TrackState trackState) {
        this.trackState = trackState;
    }


    public static void main(String [] args){


        TrackState State = new FreeTrack();


        TrackContext track1 = new TrackContext(1);
        TrackContext track2 = new TrackContext(2);
        TrackContext track3 = new TrackContext(3);

        Airplane airplane;
        ArrayList<Airplane> planes= new ArrayList<>();

        for(int i=0;i<10;i++){
            airplane = new Airplane();
            planes.add(i,airplane);
        }

        int count=0;
        while(count <10) {

            //State.putAirplaneInTrack(planes.get(count),track1);
            if(State.putAirplaneInTrack(planes.get(count),track1)){
                count++;
            }else{
                //State.putAirplaneInTrack(planes.get(count),track2);
                if(State.putAirplaneInTrack(planes.get(count),track2)){
                    count++;
                }else{
                    //State.putAirplaneInTrack(planes.get(count),track3);
                    if(State.putAirplaneInTrack(planes.get(count),track3)){
                        count++;
                    }
                }
            }

        }
    }


}



/*        |   |   |   |
        |   |   |   |
        |   |   |   |
        |   |   |   |
        |   |   |   |
                            Queu - Y Y Y Y Y Y
*/

