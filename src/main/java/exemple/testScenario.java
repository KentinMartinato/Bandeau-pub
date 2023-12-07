package exemple;

import bandeau.Bandeau;

public class testScenario {
    public static void main (String[]args){
        new testScenario().testLesEffets();
    }
    public void testLesEffets(){
        Bandeau monBandeau = new Bandeau();

        scenario scene = new scenario();
        scene.ajouterEffet(new ClignoterEnCouleur(),1);
        scene.ajouterEffet(new EffetZoom(),1);
        scene.ajouterEffet(new Rotation(),2);
        scene.ajouterEffet(new ClignoterEnCouleur(),1);

        scene.play(monBandeau);

        monBandeau.close();
    }
}
