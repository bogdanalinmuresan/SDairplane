import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;


public class DrawTracks {
    TrackContext track1 = new TrackContext(1);
    TrackContext track2 = new TrackContext(2);
    TrackContext track3 = new TrackContext(3);


public void createInterface(Queue<Airplane> takeoffAirplanes,Queue<Airplane> landedAirplanes){

        JFrame f=new JFrame();//creating instance of JFrame

        JButton b=new JButton("landed");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height

        JButton b2=new JButton("takeoff");//creating instance of JButton
        b2.setBounds(130,50,100, 40);//x axis, y axis, width, height

        JButton b3=new JButton("Walking AirplaneQueue");//creating instance of JButton
        b3.setBounds(130,0,100, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame
        f.add(b2);//adding button in JFrame
        f.add(b3);


        JLabel num1=new JLabel("Track1");
        num1.setBounds(30,100,100, 40);
        num1.setOpaque(true);
        num1.setBackground(Color.green);
        f.add(num1);

        JLabel num2=new JLabel("Track2");
        num2.setBounds(30,150,100, 40);
        num2.setOpaque(true);
        num2.setBackground(Color.green);
        f.add(num2);

        JLabel num3=new JLabel("Track3");
        num3.setBounds(30,200,100, 40);
        num3.setOpaque(true);
        num3.setBackground(Color.green);
        f.add(num3);


        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible


        //listener for the landed botton
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(!landedAirplanes.isEmpty()){
                    if(track1.getTrack() instanceof FreeTrack){
                        track1.getTrack().putAirplaneInTrack(landedAirplanes.poll(),track1);
                        num1.setBackground(Color.RED);
                    }else{
                        if(track2.getTrack() instanceof FreeTrack){
                            track2.getTrack().putAirplaneInTrack(landedAirplanes.poll(),track2);
                            num2.setBackground(Color.RED);
                        }else{
                            if(track3.getTrack() instanceof FreeTrack){
                                track3.getTrack().putAirplaneInTrack(landedAirplanes.poll(),track3);
                                num3.setBackground(Color.RED);
                            }
                        }
                    }
                }else{
                    System.out.println("This queue is empty.");
                }
            }
        });

        //listener for the takeof botton
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(!takeoffAirplanes.isEmpty()){
                    if(track1.getTrack() instanceof FreeTrack){
                        track1.getTrack().putAirplaneInTrack(takeoffAirplanes.poll(),track1);
                        num1.setBackground(Color.RED);
                    }else{
                        if(track2.getTrack() instanceof FreeTrack){
                            track2.getTrack().putAirplaneInTrack(takeoffAirplanes.poll(),track2);
                            num2.setBackground(Color.RED);

                        }else{
                            if(track3.getTrack() instanceof FreeTrack){
                                track3.getTrack().putAirplaneInTrack(takeoffAirplanes.poll(),track3);
                                num3.setBackground(Color.RED);

                            }
                        }
                    }
                }else{
                    System.out.println("This queue is empty.");
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(track1.getTrack() instanceof OcuppiedTrack){
                    track1.setTrack(new FreeTrack());
                    num1.setBackground(Color.GREEN);
                }else{
                    if(track2.getTrack() instanceof OcuppiedTrack){
                        track2.setTrack(new FreeTrack());
                        num2.setBackground(Color.GREEN);
                    }else{
                        if(track3.getTrack() instanceof OcuppiedTrack){
                            track3.setTrack(new FreeTrack());
                            num3.setBackground(Color.GREEN);
                        }
                    }
                }
            }
        });
    }

}
