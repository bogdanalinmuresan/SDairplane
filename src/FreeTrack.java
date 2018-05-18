

public class FreeTrack implements Track{

    String status = "FREE";

    @Override
    public void doAction(Airplane airplane) {
        airplane.setTrack(new OcuppiedTrack());
    }
}
