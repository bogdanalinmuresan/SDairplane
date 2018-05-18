import java.util.ArrayList;

public class Airplane {

    private  String status = "";
    private  int ID = 0;
    private  ArrayList<Airplane> planes = new ArrayList<>();
    private Track track;

    public Track getTrack(){
        return this.track;
    }

    public void setTrack(final Track track){
        this.track=track;
    }

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public Airplane(String status, int ID){
        this.status = status;
        this.ID = ID;
    }



    public ArrayList<Airplane> getPlanes(){
        return this.planes;
    }
    public static String randomStatus(){
        int random = (int) Math.round(Math.random());
        if(random == 1){
            return "TAKEOFF";
        }else{
            return "LANDING";
        }
    }
    public ArrayList<Airplane> landAirplane(){

        return planes;
    }
    public String[] takeOffAirplane(){

        return null;
    }
    public void createPlanes(){
        for(int i=0;i<12;i++){
            status = randomStatus();
            planes.add(new Airplane(status,i));
        }
    }

    public static void main(String [] args){
        String status = "";
        int ID = 0;
        Airplane airplane  = new Airplane(status,ID);
        airplane.createPlanes();
        for(int i=0;i<12;i++){
            System.out.println("ID: "+airplane.getPlanes().get(i).ID+" -- Status: "+airplane.getPlanes().get(i).status);

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

