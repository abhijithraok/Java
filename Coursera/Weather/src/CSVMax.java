/**
 * Created by abhij on 18-May-17.
 */
import edu.duke.*;
import org.apache.commons.csv.*;

public class CSVMax {
    public CSVRecord hottestHourInFile(CSVParser parser) {
        CSVRecord largestSoFar = null;
        for (CSVRecord currentRow : parser) {
            if (largestSoFar == null) {
                largestSoFar = currentRow;
            } else {
                double CurrentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double LargestTemp = Double.parseDouble(largestSoFar.get("TemperatureF"));
                if (CurrentTemp > LargestTemp) {
                    largestSoFar = currentRow;
                }
            }

        }
        return largestSoFar;

    }
    public CSVRecord coldestHourInFile(CSVParser parser) {
        CSVRecord coldestSoFar =null;
        for(CSVRecord currentRow :parser){
            if(coldestSoFar == null){
                coldestSoFar = currentRow;
            }
            else{
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double coldestTemp = Double.parseDouble(coldestSoFar.get("TemperatureF"));
                if (coldestTemp > currentTemp){
                    coldestSoFar = currentRow;
                }
            }
        }
        return coldestSoFar;
    }
   // public CSVRecord FileWithColdestTemperature{

    //}



    public void Test(){
        FileResource fr1 = new FileResource("C:\\Users\\abhij\\Downloads\\nc_weather\\nc_weather\\2015\\weather-2015-01-01.csv");
        CSVRecord hotest = hottestHourInFile(fr1.getCSVParser());
        System.out.println("Hottest temperature was " + hotest.get("TemperatureF") + " at" + hotest.get("TimeEST"));
        FileResource fr2 = new FileResource("C:\\Users\\abhij\\Downloads\\nc_weather\\nc_weather\\2015\\weather-2015-01-01.csv");
        CSVRecord coldest = coldestHourInFile(fr2.getCSVParser());
        System.out.println("Coldest temperature was " + coldest.get("TemperatureF") + " at" + coldest.get("TimeEST"));
    }
    }


