package exemple;

import bandeau.Bandeau;


public class Rotation implements effet{
@Override
    public void play(Bandeau bandeau){
        String message = "Pizza";
        bandeau.setMessage(message);
        for (int i=0; i<360; i+=10){
            bandeau.setRotation(Math.toRadians(i));
            bandeau.sleep(100);
        }
        bandeau.setRotation(0);

    }
}
