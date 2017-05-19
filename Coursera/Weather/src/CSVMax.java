/**
 * Created by abhij on 18-May-17.
 */
import edu.duke.*;
import org.apache.commons.csv.*;

import java.io.File;

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
        CSVRecord coldestSoFar = null;
        for (CSVRecord currentRow : parser) {
            coldestSoFar = getcoldestSoFar(currentRow, coldestSoFar);
        }
        return coldestSoFar;
    }

    public CSVRecord fileWithColdestTemperature() {
        String currentFile = "";
        CSVRecord coldestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVRecord currentRow = coldestHourInFile(fr.getCSVParser());
            coldestSoFar = getcoldestSoFar(currentRow, coldestSoFar);
            currentFile = f.getName();
        }
        return coldestSoFar;
    }


    public CSVRecord getcoldestSoFar(CSVRecord currentRow, CSVRecord coldestSoFar) {
        //If largestSoFar is nothing
        if (coldestSoFar == null) {
            coldestSoFar = currentRow;
        } else {
            double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
            double coldestTemp = Double.parseDouble(coldestSoFar.get("TemperatureF"));
            if (coldestTemp > currentTemp) {
                coldestSoFar = currentRow;
            }
        }
        return coldestSoFar;
    }

    public CSVRecord lowestHumidityInFile(CSVParser parser) {
        CSVRecord lowestSoFar = null;
        for (CSVRecord currentRow : parser) {
            String humidity =currentRow.get("Humidity");
            if (humidity.equals("N/A")) {
               continue;
            }
             if (lowestSoFar == null) {
                lowestSoFar = currentRow;
            }
            else {
                double currentHumidity = Double.parseDouble(currentRow.get("Humidity"));
                double lowestHumidity = Double.parseDouble(lowestSoFar.get("Humidity"));
                 if( lowestHumidity == currentHumidity){
                     return lowestSoFar;
                 }
               else if (lowestHumidity  > currentHumidity) {
                    lowestSoFar = currentRow;
                }

            }

        }
        return lowestSoFar;
    }
    public CSVRecord lowestHumidityInmanyFiles(){

    }


    public void testColdestHourInFile() {
      /*  FileResource fr1 = new FileResource("C:\\Users\\abhij\\Downloads\\nc_weather\\nc_weather\\2015\\weather-2015-01-01.csv");
        CSVRecord hotest = hottestHourInFile(fr1.getCSVParser());
        System.out.println("Hottest temperature was " + hotest.get("TemperatureF") + " at" + hotest.get("TimeEST"));
        */


        FileResource fr2 = new FileResource("C:\\Users\\abhij\\Downloads\\nc_weather\\nc_weather\\2015\\weather-2015-01-01.csv");

        CSVRecord coldest = coldestHourInFile(fr2.getCSVParser());
        System.out.println("Coldest temperature was " + coldest.get("TemperatureF") + " at" + coldest.get("TimeEST"));


    }

    public void testFileWithColdestTemperature() {
        CSVRecord fileWithColdest = fileWithColdestTemperature();
        System.out.println("Coldest temperature was " + fileWithColdest.get("TemperatureF") + " at" + fileWithColdest.get("DateUTC"));

    }

    public void testLowestHumidityInFile() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        CSVRecord csv = lowestHumidityInFile(parser);
        System.out.println("Lowest humidity is " + csv.get("Humidity") + " at" + csv.get("DateUTC"));
    }


}