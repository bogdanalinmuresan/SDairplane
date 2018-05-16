import java.util.ArrayList;

public class Airplane {

    private static String status = "";
    private static int ID = 0;
    private static ArrayList<Airplane> planes = new ArrayList<>();

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

    public static void main(String [] args){
        for(int i=0;i<12;i++){
            status = randomStatus();
            planes.add(new Airplane(status,i));

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

