/**
 * Created by Jay on 13-3-2017.
 */
public class KiwiFactory {
    private int beslissing = 0;

    public Kiwi MaakKiwi(){
        if(beslissing == 0){
            Kiwi kiwi = new AustralischeKiwiAdapter();
            return kiwi;
        }
        else if(beslissing == 1){
            Kiwi kiwi = new DuitseKiwiAdapter();
            return kiwi;
        }
        else{
            Kiwi kiwi = new NederlandseKiwiAdapter();
            return kiwi;
        }
    }

}
