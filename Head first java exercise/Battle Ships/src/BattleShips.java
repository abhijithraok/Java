/**
 * Created by Abhijith on 09-Nov-17.
 */
import java.util.*;
public class BattleShips {
    public static void main(String[] args) {
        String[][] oceanMap = new String[10][10];
        System.out.println("**** Welcome to Battle Ships game ****\n Right now, the sea is empty");
      String [][]oceanMap2=  oceanMap(oceanMap);
        deployPlayersShips(oceanMap);
      // System.out.println(Arrays.deepToString(oceanMap));
    }

    public static String[][] oceanMap(String[][] oceanMap) {
System.out.println("  0123456789");
        for (int i = 0; i < oceanMap.length; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < oceanMap.length; j++) {
                if (oceanMap[i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(oceanMap[i][j]);
                }
            }
            System.out.println("|" + i);
        }
        return oceanMap;
    }
    public static void deployPlayersShips(String [][] oceanMapArray){
        boolean b = false;
        int count = 0;
        int range = 10;
        Scanner input = new Scanner(System.in);
       while (count < 4){
            System.out.print("Enter X coordinate for your ship: ");
            int x =Integer.parseInt(input.nextLine());
            System.out.print("Enter Y coordinate for your ship: ");
            int y = Integer.parseInt(input.nextLine());
                if ( x < 10 && y < 10 && oceanMapArray[y][x] == null  ) {
                    oceanMapArray[y][x] = "@";
                    count++;
                }

        }
        oceanMap(oceanMapArray);
    }
}
