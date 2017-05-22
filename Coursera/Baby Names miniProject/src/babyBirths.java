import edu.duke.FileResource;
import org.apache.commons.csv.*;

/**
 * Created by Abhijith on 22-May-17.
 */
public class babyBirths {
    public void printNames(FileResource fr) {
        // FileResource fr = new FileResource();
        for (CSVRecord record : fr.getCSVParser(false)) {
            int numborn = Integer.parseInt(record.get(2));
            if (numborn <= 100) {
                System.out.println(" Name " + record.get(0) + " Gender " + record.get(1) + " Num Born " + record.get(2));
            }
        }
    }

    public void totalBirths(FileResource fr) {
        int totalBirths = 0;
        int totalBoys = 0;
        int totalGirls = 0;
        int girlsName = 0;
        int boysName = 0;
        int totalNumOfName = 0;
        for (CSVRecord record : fr.getCSVParser(false)) {
            int numborn = Integer.parseInt(record.get(2));
            totalBirths += numborn;
            if (record.get(1).equals("F")) {
                totalGirls += numborn;
                girlsName += 1;

            } else {
                totalBoys += numborn;
                boysName += 1;

            }
            totalNumOfName = boysName + girlsName;

        }
        System.out.println("Total births = " + totalBirths + " total names " + totalNumOfName);
        System.out.println("Total Girls = " + totalGirls + " Number of girls name " + girlsName);
        System.out.println("Total Boys = " + totalBoys + " Number of boys name " + boysName);


    }


    public void test() {
        FileResource fr = new FileResource("C:\\Users\\abhij\\Documents\\GItHub\\Java\\Coursera\\Baby Names miniProject\\us_babynames\\us_babynames_test\\example-small.csv");
        totalBirths(fr);
     //   printNames(fr);
    }
}
