/**
 * Created by abhij on 05-Mar-17.
 */
public class DVDPLayer {
    boolean canRecord = false;
    void recordDVD() {
        System.out.println("DVD recording");
    }
        void playDVD(){
        System.out.println("playing DVD");
    }
    }

class DVDPlayerTestDrive{
    public static void main(String [] args){
        DVDPLayer d = new DVDPLayer();
        d.canRecord=true;
        d.playDVD();
        if(d.canRecord == true )
        {
            d.recordDVD();
        }
    }
}
