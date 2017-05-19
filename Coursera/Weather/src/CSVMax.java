/**
 * Created by abhij on 18-May-17.
 */
import edu.duke.*;
import org.apache.commons.csv.*;

public class CSVMax {
    public CSVRecord HottestHourInFile(CSVParser Parser) {
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
    public CSVRecord ColdestHourInFile(CSVParser Parser) {
        CSVRecord ColdestSoFar =null;
        for(CSVRecord CurrentRow :Parser){
            if(ColdestSoFar == null){
                ColdestSoFar = CurrentRow;
            }
            else{
                double CurrentTemp = Double.parseDouble(CurrentRow.get("TemperatureF"));
                double ColdestTemp = Double.parseDouble(ColdestSoFar.get("TemperatureF"));
                if (ColdestTemp > CurrentTemp){
                    ColdestSoFar = CurrentRow;
                }
            }
        }
        return ColdestSoFar;
    }



    public void Test(){
        FileResource fr1 = new FileResource("C:\\Users\\abhij\\Downloads\\nc_weather\\nc_weather\\2015\\weather-2015-01-01.csv");
        CSVRecord Largest = HottestHourInFile(fr1.getCSVParser());
        System.out.println("Hottest temperature was " + Largest.get("TemperatureF") + " at" + Largest.get("TimeEST"));
        FileResource fr2 = new FileResource("C:\\Users\\abhij\\Downloads\\nc_weather\\nc_weather\\2015\\weather-2015-01-01.csv");
        CSVRecord Coldest = ColdestHourInFile(fr2.getCSVParser());
        System.out.println("Coldest temperature was " + Coldest.get("TemperatureF") + " at" + Coldest.get("TimeEST"));
    }
    }


