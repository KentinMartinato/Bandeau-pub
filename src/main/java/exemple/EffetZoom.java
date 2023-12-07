package exemple;

import bandeau.Bandeau;
import java.awt.Font;

public class EffetZoom implements effet{
@Override
    public void play(Bandeau bandeau){
        String message = "Pizza";
        bandeau.setMessage(message);
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
    }

}
}
