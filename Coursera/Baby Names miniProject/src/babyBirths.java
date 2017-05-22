import edu.duke.FileResource;
import org.apache.commons.csv.*;

/**
 * Created by Abhijith on 22-May-17.
 */
public class babyBirths {
    public void printNames(){
        FileResource fr = new FileResource();
        for(CSVRecord record : fr.getCSVParser()){
            System.out.println("name" +record.get(0) +"gender" + record.get(1));
        }
    }
}
