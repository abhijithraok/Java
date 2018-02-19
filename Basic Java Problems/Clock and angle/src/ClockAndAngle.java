/**
 * Created by Abhijith on 19-Feb-18.
 */
import java.util.*;
public class ClockAndAngle {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList> hm = new HashMap<>();
        double tempAngle;
        // finding angle between hour and minute hand from 1 to 12

     /*  for (int i = 1; i < 13; i++) {
            ArrayList<Double> angle = new ArrayList<Double>();
            for (int j = 0; j < 60; j += 5) {
                tempAngle = calculateAngle(i, j);
                angle.add(tempAngle);
            }
            hm.put(i, angle);   // using hashmap to put hour as key and angle from 5 to 55 minute in list to hm
        }
        for (Map.Entry<Integer, ArrayList> e : hm.entrySet()) {
            int a = e.getKey();
            ArrayList<Double> b = e.getValue();
            System.out.println(a + "" + b);
        }
*/
        // printing all angle between hour and minute from 9 am to 8.55 pm interval of 5minute

        for(int i = 9;i <=12;i++){
            for(int j =0;j< 60;j+=5) {
                System.out.println("For hour " + i + " " + "Minute " + j + " " + "angle is: " + calculateAngle(i, j));
            }
        }
        for(int i = 1;i < 9;i++){
            for(int j = 0; j< 60;j+=5){
                System.out.println("For hour " + i + " " + "Minute " + j + " " + "angle is: " + calculateAngle(i, j));
            }
        }


    }

    public static double calculateAngle(int h, int m) {   //calculating angle between hour and minute
        if (h == m) {
            return 0;
        }
        double x = 0.5 * ((60 * h) - (11 * m));
        double angel = Math.abs(x);
        if (angel > 180) {
            angel = 360 - angel;
            return angel;
        }
        return angel;
    }
}
