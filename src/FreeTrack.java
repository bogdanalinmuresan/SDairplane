

public class FreeTrack implements Track{

    String status = "FREE";
    Airplane airplane = null;

    @Override
    public String doAction(Airplane airplane) {

        return status;
    }
}
