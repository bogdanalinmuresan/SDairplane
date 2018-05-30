import javax.sound.midi.Track;
import java.lang.reflect.Array;
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

    public TrackState getTrack() {
        return trackState;
    }

    public void setTrack(TrackState trackState) {
        this.trackState = trackState;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

     /*public static void main(String [] args){

      if(track1.getTrack() instanceof FreeTrack){
            if(freeState.putAirplaneInTrack(landingPlanes.get(count),track1)){
                System.out.println("Landed the airplane-"+landingPlanes.get(count).ID+" into track-"+track1.getID());
                landingPlanes.remove(count);
                count++;
            }
        }else{
            if(occupiedState.putAirplaneInTrack(takingOffPlanes.get(count),track1)){
                System.out.println("Landed the airplane-"+takingOffPlanes.get(count).ID+" into track-"+track1.getID());
                count++;
            }
        }
        if(track2.getTrack() instanceof FreeTrack){
            if(freeState.putAirplaneInTrack(landingPlanes.get(count),track2)){
                System.out.println("Landed the airplane-"+landingPlanes.get(count).ID+" into track-"+track2.getID());
                count++;
            }
        }else{
            if(occupiedState.putAirplaneInTrack(takingOffPlanes.get(count),track2)){
                System.out.println("Landed the airplane-"+takingOffPlanes.get(count).ID+" into track-"+track2.getID());
                count++;
            }
        }
        if(track3.getTrack() instanceof FreeTrack){
            if(freeState.putAirplaneInTrack(landingPlanes.get(count),track3)){
                System.out.println("Landed the airplane-"+landingPlanes.get(count).ID+" into track-"+track3.getID());
                count++;
            }
        }else{
            if(occupiedState.putAirplaneInTrack(takingOffPlanes.get(count),track3)){
                System.out.println("Landed the airplane-"+takingOffPlanes.get(count).ID+" into track-"+track3.getID());
                count++;
            }
        }

    }*/


}



/*        |   |   |   |
        |   |   |   |
        |   |   |   |
        |   |   |   |
        |   |   |   |
                            Queu - Y Y Y Y Y Y
*/

