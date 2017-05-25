import edu.duke.DirectoryResource;
import edu.duke.FileResource;
import org.apache.commons.csv.*;

import java.io.File;


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

    public Integer getRank(Integer year, String name, String gender) {
        FileResource fr = new FileResource("C:\\Users\\abhij\\Documents\\GItHub\\Java\\Coursera\\Baby Names miniProject\\us_babynames\\us_babynames_test\\yob" + year + "short.csv");
        int rank = 0;
        for (CSVRecord record : fr.getCSVParser(false)) {
            if (gender.equals(record.get(1))) {
                rank += 1;
            }
            // int numborn = Integer.parseInt(record.get(2));

            if (record.get(1).equals(gender) && record.get(0).equals(name)) {
                // System.out.print(name);
                return rank;
            }


        }
        return -1;

    }


    public String getName(Integer year, Integer rank, String gender) {
        String name = null;
        int currRank = 0;
        FileResource fr = new FileResource(String.format("C:\\Users\\abhij\\Documents\\GItHub\\Java\\Coursera\\Baby Names miniProject\\us_babynames\\us_babynames_test\\yob%sshort.csv", year));
        for (CSVRecord record : fr.getCSVParser(false)) {
            if (gender.equals(record.get(1))) {
                currRank += 1;
            }
            if (gender.equals(record.get(1)) && rank == currRank) {
                return record.get(0);
            }

        }
        return "NO Name";
    }

    public String whatIsNameInYear(String name, Integer year, Integer newYear, String gender) {
        String newName = "";
        String currName = "";
        int currRank = getRank(year, name, gender);
        newName = getName(newYear, currRank, gender);
        System.out.println(name + " born in " + year + " would be  " + newName + " if she was born in " + newYear);
        return newName;
    }

    public Integer yearOfHighestRank(String name, String gender) {
        String fileName = "";
        int currRank = 0;
        int currYear = 0;
        int a = 0;
        int newRank = 0;
        String fileName1 = "";
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            fileName = f.getName();
            a = Integer.parseInt(fileName.substring(3, 7));
            currRank = getRank(a, name, gender);
            if (newRank == 0) {
                newRank = currRank;
                fileName1 = f.getName();
                currYear = Integer.parseInt(fileName1.substring(3, 7));

            } else {

                if (newRank > currRank) {
                    newRank = currRank;
                    fileName1 = f.getAbsolutePath();
                    currYear = Integer.parseInt(fileName1.substring(3, 7));
                }

            }

        }

        return currYear;
    }


    public double getAverageRank(String name, String gender) {
        double count = 0;
        double sum = 0;
        double avg = 0;
        int currRank = 0;
        int rank1 = 0;
        int rank2 = 0;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            int rank = 0;
            FileResource fr = new FileResource(f);
            count += 1;
            for (CSVRecord record : fr.getCSVParser(false)) {
                if (gender.equals(record.get(1))) {
                    rank += 1;
                }
                if (record.get(1).equals(gender) && record.get(0).equals(name)) {
                    rank1 = rank;

                }

            }
            rank2 += rank1;

        }
        return avg = rank2 / count;
    }


    public void test() {
        FileResource fr = new FileResource("C:\\Users\\abhij\\Documents\\GItHub\\Java\\Coursera\\Baby Names miniProject\\us_babynames\\us_babynames_test\\example-small.csv");
        //totalBirths(fr);
        //   printNames(fr);
        // getRank(2012 ,"Noah" ,"F");

    }

    public void ranktest() {
        int a = getRank(2012, "Noah", "M");
        System.out.println(" " + a);

    }

    public void testGetName() {
        String a = getName(2012, 2, "M");
        System.out.println(a);
    }

    public void testWhatIsNameInYear() {
        String a = whatIsNameInYear("Isabella ", 2012, 2014, "F");
        System.out.println(a);
    }

    public void testWhatIsNmaeInyear() {
        whatIsNameInYear("Isabella", 2012, 2014, "F");

    }

    public void testYearOfHighestRank() {
        int year = yearOfHighestRank("Mason", "M");
        System.out.println(year);
    }

    public void testGetAverageRank() {
        double avg = getAverageRank("Jacob", "M");
        System.out.print(avg);
    }
}