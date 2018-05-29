public class Airplane {
    TrackContext trackContext;
    String status="";
    int id;

    public Airplane(TrackContext trackContext){
        this.trackContext=trackContext;
        this.status=randomStatus();
        this.id=(int)Math.round(Math.random()*10);
    }

    public void wantToPlane(){

    }

    public static String randomStatus(){
        int random = (int) Math.round(Math.random());
        if(random == 1){
            return "TAKEOFF";
        }else{
            return "LANDING";
        }
    }


}
