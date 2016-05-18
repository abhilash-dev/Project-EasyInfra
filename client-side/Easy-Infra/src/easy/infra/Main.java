package easy.infra;

/**
 * Created by abhi on 21/2/16.
 */

/**
 * This is the main class, it contains the main method
 * @author Abhilash.S
 * @version 1.0
 */
public class Main {
    /**
     * The main method creates and executes a thread for every junction
     */
    public static void main(String args[]){

        Junction axatech = new Junction("axatech");
        GetSnap t1 = new GetSnap(axatech.getJunctionName(),axatech.getJunctionCommand(),axatech.getJunctionPath());
        t1.start();

        Junction hosur1 = new Junction("hosur-road");
        GetSnap t2 = new GetSnap(hosur1.getJunctionName(),hosur1.getJunctionCommand(),hosur1.getJunctionPath());
        t2.start();

        Junction hosur2 = new Junction("hosur-road-2");
        GetSnap t3 = new GetSnap(hosur2.getJunctionName(),hosur2.getJunctionCommand(),hosur2.getJunctionPath());
        t3.start();

        Junction ringroad = new Junction("ring-road");
        GetSnap t4 = new GetSnap(ringroad.getJunctionName(),ringroad.getJunctionCommand(),ringroad.getJunctionPath());
        t4.start();

        Junction silkboard = new Junction("silkboard");
        GetSnap t5 = new GetSnap(silkboard.getJunctionName(),silkboard.getJunctionCommand(),silkboard.getJunctionPath());
        t5.start();


    }
}
