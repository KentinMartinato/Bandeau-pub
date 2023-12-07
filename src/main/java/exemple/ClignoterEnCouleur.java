package exemple;

import bandeau.Bandeau;

import java.awt.Color;

public class ClignoterEnCouleur implements effet {
    @Override
    public void play(Bandeau bandeau){

    String message = "Pizza";
    bandeau.setMessage(message);
    for(int i=0;i<10;i++){
        if (i%2==0){
    bandeau.setForeground(Color.WHITE);
    }
    else if(i==3||i==7){
        bandeau.setForeground(Color.GREEN);
    }
    else{
        bandeau.setForeground(Color.RED);
    }
    bandeau.sleep(500);
}

}
}
