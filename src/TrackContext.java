
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

}


