/**
 * Created by abhij on 13-May-17.
 */
import edu.duke.*;
public class part3 {

    /*
     * This function takes three parameter inputs:
     * 1. A String that represents the DNA strand
     * 2. A Integer that represents the index of the start codon
     * 3. A String that represents the stop codon
     *
     * This function will return the index of the stop codon,
     * provided that the difference between the start and stop indices
     * is a multiple of 3.
     */

    public int findStopCodon(String dna, int startIndex,String stopCodon){
        dna = dna.toUpperCase();
        int stopIndex = dna.indexOf(stopCodon,startIndex+3);
        while (stopIndex != -1 ) {
            int diff = stopIndex - startIndex;
            if (diff % 3  == 0) {
                return stopIndex;
            }
            else {
                stopIndex = dna.indexOf(stopCodon, stopIndex + 1);
            }
        }
        return -1;

    }
    public String findGene(String dna, int where) {
        /*
     * This function takes a String parameter that represents
     * a DNA strand, and return the gene formed from start codon ATG
     * and the closest stop codon that is a multiple of three away.
     * If there is no valid stop codon, return an empty string
     */

        dna = dna.toUpperCase();
        int startIndex = dna.indexOf("ATG", where);
        if (startIndex == -1) {
            return "";
        }
        int taaIndex = findStopCodon(dna,startIndex,"TAA");
        int tagIndex = findStopCodon(dna,startIndex,"TAG");
        int tgaIndex = findStopCodon(dna,startIndex,"TGA");
        int minIndex = 0;
        if (taaIndex == -1 ||(tgaIndex != -1 && tgaIndex < taaIndex)) {
            minIndex = tgaIndex;
        }
        else {
            minIndex = taaIndex;
        }
        if (minIndex == -1 ||(tagIndex != -1 && tagIndex < minIndex)) {
            minIndex = tagIndex;
        }
        if (minIndex == -1){
            return "";
        }
        return dna.substring(startIndex,minIndex + 3);
    }
    public float cgRatio(String dna)
    /*
     * This method takes one String parameter representing the DNA string
     * and returns the ratio of C's and G's as a fraction of the entire strand
     * of DNA.
     *
     * The ratio is returned as a double type value.
     */
    {
        //Convert string input to all upper case
        dna = dna.toUpperCase();

        //Make sure you have a valid DNA string of at least one character
        if (dna.length() == 0)
        {
            return (float) 0;
        }

        //Convert input into all upper case
        dna = dna.toUpperCase();

        //Set CG Count to zero
        int cg_count = 0;

        for (int index = 0; index < dna.length(); index++)
        {
            if (dna.charAt(index) == 'C' || dna.charAt(index) == 'G')
            {
                cg_count += 1.00;
            }
        }

        int total_nucleotides = dna.length();

        return (float) cg_count/total_nucleotides;
    }

    public StorageResource getAllGenes(String dna) {
        //create an empty StorageResource, call it geneList
        dna =dna.toUpperCase();
        StorageResource geneList = new StorageResource();
        //Set startIndex to 0
        int startIndex = 0;
        //Repeat the following steps
        while ( true ) {
            //Find the next gene after startIndex
            String currentGene = findGene(dna, startIndex);
            //If no gene was found, leave this loop
            if (currentGene.isEmpty()) {
                break;
            }
            //Add that gene to geneList
            geneList.add(currentGene);
            //Set startIndex to just past the end of the gene
            startIndex = dna.indexOf(currentGene, startIndex) +
                    currentGene.length();
        }
        //Your answer is geneList
        return geneList;
    }

    public void processGenes(StorageResource store)
    /*
     * This method takes a StorageResource object containing a series of strings.
     * This method processes all the string to find out information about them.
     * Specifically, it should:
     * 1. print all the Strings in sr that are longer than 60 characters
     * 2. print the number of Strings in sr that are longer than 60 characters
     * 3. print the Strings in sr whose C-G-ratio is higher than 0.35
     * 4. print the number of strings in sr whose C-G-ratio is higher than 0.35
     * 5. print the length of the longest gene in sr
     */
    {
        //Initialize all variables for returning the number of strings
        int longer_than_sixty = 0;
        int high_CG_ratio = 0;
        int longest_string_length = 0;
        int ctgFrequency = 0;

        System.out.println("Total genes stored: " + store.size() );


        //Begin looping through each String in the StorageResource object.
        for ( String gene : store.data() )
        {
            //Determine if the gene length is greater than 9
            System.out.println(gene);
            if ( gene.length() > 60 )
            {
                longer_than_sixty += 1;

                if ( gene.length() > longest_string_length )
                {
                    longest_string_length = gene.length();
                }

            }
        }

        System.out.println("\nTotal Number of Strings longer than 60 characters:" + longer_than_sixty);

        for ( String gene : store.data() )
        {
            //Determine the CG ratio of each gene
            if ( cgRatio(gene) > (float)0.35 )
            {
                high_CG_ratio += 1;
            }
        }

        System.out.println("\nTotal number of Strings whose C-G ratio is higher than 0.35: " + high_CG_ratio);

        System.out.println("\nThe longest string length is: " + longest_string_length);

    }

    public  void testProcessGenes()
    /*
     * Test method for testing processGenes() method
     */
    {
        URLResource urlLink = new URLResource("https://users.cs.duke.edu/~rodger/GRch38dnapart.fa");
        String dna = urlLink.asString();

        //Convert string to all uppercase
        dna = dna.toUpperCase();

        StorageResource genes = getAllGenes(dna);

        processGenes(genes);

        //The following code is for the quiz
        int ctgFrequency = 0;
        int currentIndex = 0;

        while(true)
        {
            int ctgIndex = dna.indexOf("CTG", currentIndex);

            if (ctgIndex == -1)
            {
                break;
            }

            ctgFrequency += 1;

            currentIndex = dna.indexOf("CTG", currentIndex) + 3;
        }

        System.out.println("\nFrequency of CTG codon:" + ctgFrequency);
    }


}


