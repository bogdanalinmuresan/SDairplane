public class OcuppiedTrack implements Track {

    String status = "OCUPPIED";
    Airplane airplane = null;

    @Override
    public String doAction(Airplane airplane) {
        return status;
    }

}
