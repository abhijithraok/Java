import edu.duke.*;
import org.apache.commons.csv.*;
/**
 * Created by abhij on 15-May-17.
 */
public class WhichCountriesExport {
    public void countryinfo(CSVParser parser, String country) {
        boolean found =false;
        for (CSVRecord record : parser) {
            String country1 = record.get("Country");
            if (country1.contains(country)) {
                String export = record.get("Exports");
                String value = record.get("Value (dollars)");
                System.out.print(country + ":" + " ");
                System.out.print(export +":");
                System.out.println(value);
                found =true;
            }
        }
            if(!found){
            System.out.println("NOT FOUND");
            }

        }
   public void listExportersTwoProducts(CSVParser parser, String exportitem1, String exportitem2){
       FileResource fr = new FileResource();
       parser = fr.getCSVParser();
       for(CSVRecord record: parser){
            String exports = record.get("Exports");
            if(exports.contains(exportitem1) && exports.contains(exportitem2)){
                String country1 = record.get("Country");
                System.out.println(" country which exports both items are " + country1);

            }

        }

    }
    public void numberOfExporters(CSVParser parser,String exportItem){
       int count =  0;
        FileResource fr = new FileResource();
        parser = fr.getCSVParser();
        for (CSVRecord record: parser){
            String exports = record.get("Exports");
            if(exports.contains(exportItem)){

                String country2 = record.get("Country");
                count +=1;
                //System.out.println(country2);
            }
        }
        System.out.println("number of exporter :"+ count);
    }
    public void bigExporters(CSVParser parser ,String $){
        FileResource fr = new FileResource();
        parser = fr.getCSVParser();
        for(CSVRecord record : parser){
            String value = record.get("Value (dollars)");
            if(value.length() > $.length()){
                String country = record.get("Country");
                System.out.print(country);
                System.out.println(value);

            }
        }

    }

    public  void tester(){
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
       // countryinfo(parser,"Nauru");
       // listExportersTwoProducts(parser,"cotton","flowers");
        //numberOfExporters(parser,"cocoa");
       bigExporters(parser,"$999,999,999,999");

    }
}

