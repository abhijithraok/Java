/**
 * Created by Abhijith on 09-Nov-17.
 */

import java.util.*;

public class BattleShips {
    //keeps track of player and computers ship
    public static String[][] mainOceanMap = new String[10][10];

    public static void main(String[] args) {
        int playerCount = 0;
        int pcCount = 0;
        String[][] oceanMap = new String[10][10];
        System.out.println("**** Welcome to Battle Ships game ****\n Right now, the sea is empty");
        oceanMapDisplay(oceanMap);
        String[][] oceanMap1 = deployPlayersShips(oceanMap);
        String [][] oceanMap2 = deployComputersShips(oceanMap1);
        mainOceanMap = oceanMap2;
        // System.out.println(Arrays.deepToString(oceanMap));
        while (pcCount <= 2) {
            playersTurn(mainOceanMap);
            pcCount++;
        }

    }

    //displays oseanMap 10x10
    public static void oceanMapDisplay(String[][] oceanMap) {
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
        // return oceanMap;
    }

    public static String[][] deployPlayersShips(String[][] oceanMapArray) {
        int count = 1;
        Scanner input = new Scanner(System.in);
        while (count <= 2) {
            System.out.print("Enter X coordinate for your" + count + " ship: ");
            int x = Integer.parseInt(input.nextLine());
            System.out.print("Enter Y coordinate for your" + count + " ship: ");
            int y = Integer.parseInt(input.nextLine());
            if (x < 10 && y < 10 && oceanMapArray[y][x] == null) {
                oceanMapArray[y][x] = "@";
                count++;
            }

        }
        oceanMapDisplay(oceanMapArray);
        return oceanMapArray;
    }

    public static String[][] deployComputersShips(String[][] oceanMapArray) {
        int count = 1;
        Random rand = new Random();
        System.out.println("Computer is deploying ships");
        while (count <= 2) {
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            if (oceanMapArray[y][x] == null) {
                oceanMapArray[y][x] = "#";
                count++;
                System.out.println("ship DEPLOYED");
            }

        }
      //  oceanMap(oceanMapArray);
        return oceanMapArray;
    }
public static int playersTurn(String [][] oceanMap){
        Scanner input = new Scanner(System.in);
        System.out.println("YOUR TURN");
        int count = 0;
        int playerShipCount = 0;
        while (count <= 1){
            System.out.println("Enter X coordinate:");
            int x = Integer.parseInt(input.nextLine());
            System.out.println("Enter Y coordinate");
            int y = Integer.parseInt(input.nextLine());
            if(x < 10 && y < 10){
                if(oceanMap[y][x] == null){
                    oceanMap[y][x] ="-";
                    System.out.println("You missed");
                   // oceanMapDisplay(oceanMap);
                }
               else if(oceanMap[y][x] == "@"){
                    oceanMap[y][x] = "X";
                    System.out.println( "Oh no, you sunk your own ship :(");
                }
                else if(oceanMap[y][x] == "#"){
                   oceanMap[y][x] = "!";
                   System.out.println("Boom! You Sunk the ship!");
                   playerShipCount++;
                }
                count++;
            }
        }
            mainOceanMap = oceanMap;
        oceanMapDisplay(oceanMap);
        
     return playerShipCount;
}
public static int computersTurn(String[][] oceanMap){
    int pcCount = 0;
    int count = 0;
    System.out.println("COMPUTER'S TURN");
    Random rand = new Random();
    int x =rand.nextInt(10);
    int y = rand.nextInt(10);
    Scanner input = new Scanner(System.in);
    return pcCount;
}
}
