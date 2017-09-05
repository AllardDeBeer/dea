package fruit.oose.com;

import factories.CitrusFactory;

/**
 * Created by dejangonlag on 13/03/2017.
 */
public class Start {

    public static void main(String[] args){
        Mens ms = new Mens();
        CitrusFactory cs = new CitrusFactory();
        cs.addObserver(ms);
        cs.createCitrus("Clementine");
    }
}
