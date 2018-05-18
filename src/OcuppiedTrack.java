public class OcuppiedTrack implements Track {

    String status = "OCUPPIED";
    Airplane airplane = null;

    @Override
    public void doAction(Airplane airplane) {
        airplane.setTrack(new FreeTrack());

    }

}
