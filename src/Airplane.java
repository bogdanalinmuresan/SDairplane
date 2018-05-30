public class Airplane {
    //TrackContext trackContext;
    String status="";
    int id;

    public Airplane(){
        this.status=randomStatus();
        for(int i=0;i<10;i++){
            this.id=i;
        }

    }

    public void wantToPlane(){
        //TrackContext trackContext = new TrackContext();
        //Airplane airplane = new Airplane(trackContext);
       // trackContext.wantToPlane(airplane);
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
