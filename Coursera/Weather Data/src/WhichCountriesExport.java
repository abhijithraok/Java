import edu.duke.*;
import org.apache.commons.csv.*;
/**
 * Created by abhij on 15-May-17.
 */
public class WhichCountriesExport {

    public void countryinfo(CSVParser parser, String country) {
        for (CSVRecord record : parser) {
            country = record.get("Country");
            if (country.contains("Germany")) {
                String export = record.get("Exports");
                String value = record.get("Value (dollars)");
                System.out.print(country + ":" + " ");
                System.out.print(export +":");
                System.out.println(value);
                break;
            } else {
                System.out.print("not found");

            }

        }
    }

   public void listExportersTwoProducts(CSVParser parser, String exportitem1, String exportitem2){
       for(CSVRecord record: parser){
            String exports1 = record.get("Exports");
            if(exports1.contains(exportitem1) && exports1.contains(exportitem2)){
                String country1 = record.get("Country");
                System.out.println(country1);

            }

        }

    }
    public void numberOfExporters(CSVParser parser,String exportItem){
        for (CSVRecord record: parser){
            String exports2 = record.get("Exports");
            if(exports2.contains(exportItem)){
                String country2 = record.get("Country");
                System.out.print(country2);
            }
        }
    }
    public  void tester(){
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        countryinfo(parser,"Germany");
        numberOfExporters(parser,"gold");
        listExportersTwoProducts(parser,"gold","diamond");

    }
}

