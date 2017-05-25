/**
 * Created by abhij on 18-May-17.
 */

import edu.duke.*;
import org.apache.commons.csv.*;

import java.io.File;
import java.util.function.DoubleBinaryOperator;

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
            if (coldestSoFar == null) {
                coldestSoFar = currentRow;
            } else {
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double coldestTemp = Double.parseDouble(coldestSoFar.get("TemperatureF"));
                if (coldestTemp > currentTemp && currentTemp != -9999) {
                    coldestSoFar = currentRow;
                }
            }
        }
        return coldestSoFar;

    }

    public String fileWithColdestTemperature() {

        CSVRecord coldestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        String filename = "";

        for (File f : dr.selectedFiles()) {

            FileResource fr = new FileResource(f);

            CSVRecord currentRow = coldestHourInFile(fr.getCSVParser());

            double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));

            if (currentTemp == -9999) {
                continue;
            }

            if (coldestSoFar == null) {
                coldestSoFar = currentRow;
                filename = f.getAbsolutePath();
            } else {
                double coldestTemp = Double.parseDouble(coldestSoFar.get("TemperatureF"));

                if (currentTemp < coldestTemp) {
                    coldestSoFar = currentRow;
                    filename = f.getAbsolutePath();
                }
            }

        }

        return filename;
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
            String humidity = currentRow.get("Humidity");
            if (humidity.equals("N/A")) {
                continue;
            }
            if (lowestSoFar == null) {
                lowestSoFar = currentRow;
            } else {
                double currentHumidity = Double.parseDouble(currentRow.get("Humidity"));
                double lowestHumidity = Double.parseDouble(lowestSoFar.get("Humidity"));


                if (lowestHumidity > currentHumidity) {
                    lowestSoFar = currentRow;
                }

            }

        }
        return lowestSoFar;
    }


    public CSVRecord lowestHumidityInManyFiles() {
        CSVRecord lowestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVRecord currentRow = lowestHumidityInFile(fr.getCSVParser());
            String humidity = currentRow.get("Humidity");
            if (humidity.equals("N/A")) {
                continue;
            }
            if (lowestSoFar == null) {
                lowestSoFar = currentRow;
            } else {
                double currentHumidity = Double.parseDouble(currentRow.get("Humidity"));
                double lowestHumidity = Double.parseDouble(lowestSoFar.get("Humidity"));
                if (lowestHumidity > currentHumidity) {
                    lowestSoFar = currentRow;
                }

            }

        }
        return lowestSoFar;
    }


    public double averageTemperatureWithHighHumidityInFile(CSVParser parser, Integer value) {
        boolean found = false;
        double sum = 0;
        double count = 0;
        for (CSVRecord currentRow : parser) {
            double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
            double currenthumidity = Double.parseDouble(currentRow.get("Humidity"));
            if (currenthumidity >= value) {
                count++;
                sum = sum + currentTemp;
                found = true;
            }
        }
        if ((found == false)) {
            System.out.println("No temperatures with that humidity");
        }

        double avg = (sum / count);
        if (found == true) {
            System.out.println("Average temperature is " + avg);
        }
        return avg;

    }


    public double averageTemperatureInFile(CSVParser parser) {
        double sum = 0;
        double count = 0;
        for (CSVRecord currentRow : parser) {
            double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
            count++;
            sum = sum + currentTemp;

        }
        double avg = (sum / (count));
        System.out.println("count is " + count);
        System.out.println(sum);
        return avg;
    }


    public void testColdestHourInFile() {
        FileResource fr1 = new FileResource();
        CSVRecord hotest = hottestHourInFile(fr1.getCSVParser());
        System.out.println("Hottest temperature was " + hotest.get("TemperatureF") + " at" + hotest.get("TimeEST"));


        FileResource fr2 = new FileResource();

        CSVRecord coldest = coldestHourInFile(fr2.getCSVParser());
        System.out.println("Coldest temperature was " + coldest.get("TemperatureF") + " at" + coldest.get("TimeEST"));


    }


    public void testLowestHumidityInFile() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        CSVRecord csv = lowestHumidityInFile(parser);
        System.out.println("Lowest humidity is " + csv.get("Humidity") + " at" + csv.get("DateUTC"));
    }


    public void testLowestHumidityInManyFiles() {
        CSVRecord lowestHumidity = lowestHumidityInManyFiles();
        System.out.println("Lowest humidity was  " + lowestHumidity.get("Humidity") + " at " + lowestHumidity.get("DateUTC"));
    }

    public void testAverageTemperatureWithHighHumidityInFile() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        double avg = averageTemperatureWithHighHumidityInFile(parser, 80);
        //System.out.println("Average temperature " + avg);
    }

    public void testAverageTemperatureInFile() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        double avg = averageTemperatureInFile(parser);
        System.out.print("Average Temperature is : " + avg);
    }

    public void testFileWithColdestTemperature() {
        String pathName = fileWithColdestTemperature();
        FileResource fr = new FileResource(pathName);
        CSVParser parser = fr.getCSVParser();
        CSVRecord coldest = coldestHourInFile(fr.getCSVParser());
        System.out.println("Coldest day was in the file  " + pathName.substring(pathName.lastIndexOf("\\") + 1));
        System.out.println("Coldest temperature on that day was " + coldest.get("TemperatureF") + " at " + coldest.get("TimeEST"));
        System.out.println("All the Temperatures on coldest day were");
        for (CSVRecord record : parser) {
            System.out.println(record.get("DateUTC") + " " + record.get("TemperatureF"));
        }


    }

}


