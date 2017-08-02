/**
 * Created by Abhijith on 02-Aug-17.
 * Names scores
 Problem 22
 Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

 For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

 What is the total of all the name scores in the file?
 */
import java.io.*;
import java.util.*;

public class namesScores {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nameList = readData();
       score(nameList);
    }

    public static ArrayList readData() throws Exception {
        ArrayList<String> nameList = new ArrayList<>();
        String tempName = "";
        Scanner scan = new Scanner(new File("test.txt"));
        while (scan.hasNextLine()) {
            String name[] = scan.nextLine().split(",");
            for (int i = 0; i < name.length; i++) {
                tempName = name[i];
                nameList.add(tempName);
            }
        }
        return nameList;
    }

    public static void score(ArrayList<String> nameList){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap<String ,Integer> nameMap = new HashMap<>();
        Collections.sort(nameList);
        for(int i = 0; i < nameList.size();i++){
            nameMap.put(nameList.get(i),i+1);
        }

        for(String name : nameMap.keySet()){
            int totalScore = 0;
            int tempSum = 0;
            for(int i = 0; i < name.length();i++){
                char currChar = name.charAt(i);
                int index = alphabet.indexOf(currChar);
                tempSum += index+1;
            }
            totalScore
        }

    }
}
