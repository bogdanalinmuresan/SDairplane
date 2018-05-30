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


}
