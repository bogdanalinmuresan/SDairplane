import java.util.ArrayList;

public class Airplane {
    //TrackContext trackContext;
    String status="";
    int ID;

    public Airplane(int ID){
        this.status=randomStatus();
        this.ID=ID;
    }

   public static String randomStatus(){
        int random = (int) Math.round(Math.random());
        if(random == 1){
            return "TAKEOFF";
        }else{
            return "LANDED";
        }
    }

    public static ArrayList<Airplane> creationAllAirplanes(){
        Airplane airplane;
        ArrayList<Airplane> planes = new ArrayList<>();

        for(int i=0;i<20;i++){
            airplane = new Airplane(i);

            planes.add(i,airplane);

        }   return planes;
    }


}
