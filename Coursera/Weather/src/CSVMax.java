/**
 * Created by abhij on 18-May-17.
 */
import edu.duke.*;
import org.apache.commons.csv.*;

public class CSVMax {
    public CSVRecord ColdestHourInFile(CSVParser Parser) {
        CSVRecord LargestSoFar = null;
        for (CSVRecord CurrentRow : Parser) {
            if (LargestSoFar == null) {
                LargestSoFar = CurrentRow;
            } else {
                double CurrentTemp = Double.parseDouble(CurrentRow.get("TemperatureF"));
                double LargestTemp = Double.parseDouble(LargestSoFar.get("TemperatureF"));
                if (CurrentTemp > LargestTemp) {
                    LargestSoFar = CurrentRow;
                }
            }

        }
        return LargestSoFar;

    }
    public void Test(){
        FileResource fr = new FileResource("C:\\Users\\abhij\\Downloads\\nc_weather\\nc_weather\\2015\\weather-2015-01-01.csv");
        CSVRecord Largest = ColdestHourInFile(fr.getCSVParser());
        System.out.println("Hottest temperature was " + Largest.get("TemperatureF") + " at" + Largest.get("TimeEST"));
    }
    }


