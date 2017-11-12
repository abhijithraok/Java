/**
 * Created by Abhijith on 09-Nov-17.
 */

import java.util.*;

public class BattleShips {
    //keeps track of player and computers ship
    public static String[][] mainOceanMap = new String[10][10];
    public static String[][] oceanMapComputerMiss = new String[10][10];
    public static String[][] oceanMapUserPcInput = new String[10][10];


    public static void main(String[] args) {
        boolean boolUser;
        boolean boolPC;
        int playerCount = 5;
        int pcCount = 5;
        String[][] oceanMap = new String[10][10];
        String[][] oceanMapTemp = new String[10][10];
        System.out.println("**** Welcome to Battle Ships game ****\n Right now, the sea is empty");
        //display oceanMap
        oceanMapDisplay(oceanMap);
        String[][] oceanMap1 = deployPlayersShips(oceanMap);
        String[][] oceanMap2 = deployComputersShips(oceanMap1);
        mainOceanMap = oceanMap2;
        while (pcCount > 0 && playerCount > 0) {
            boolUser = playersTurn(mainOceanMap);
            if (boolUser) {
                playerCount--;
            }
            boolPC = computersTurn(mainOceanMap);
            if (boolPC) {
                pcCount--;
            }
            System.out.println("Your ships :" + playerCount + " Computer Ships : " + pcCount);

        }
        if (pcCount == 0) {
            System.out.println("Hooray! you win the battle :)");
        } else {
            System.out.println("you lose");
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
        while (count <= 5) {
            System.out.print("Enter X coordinate for your" + count + " ship: ");
            int x = Integer.parseInt(input.nextLine());
            System.out.print("Enter Y coordinate for your" + count + " ship: ");
            int y = Integer.parseInt(input.nextLine());
            if (x < 10 && y < 10 && oceanMapArray[y][x] == null) {
                oceanMapArray[y][x] = "@";
                oceanMapUserPcInput[y][x] = "@";
                count++;
            }

        }
        oceanMapDisplay(oceanMapUserPcInput);
        return oceanMapArray;
    }


    public static String[][] deployComputersShips(String[][] oceanMapArray) {
        int count = 1;
        Random rand = new Random();
        System.out.println("Computer is deploying ships");
        while (count <= 5) {
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

    public static boolean playersTurn(String[][] oceanMap) {
        Scanner input = new Scanner(System.in);
        System.out.println("YOUR TURN");
        int count = 0;
        boolean bool = false;
        while (count < 1) {
            System.out.println("Enter X coordinate:");
            int x = Integer.parseInt(input.nextLine());
            System.out.println("Enter Y coordinate");
            int y = Integer.parseInt(input.nextLine());
            if (x < 10 && y < 10) {
                if (oceanMap[y][x] == null) {
                    oceanMap[y][x] = "-";
                    oceanMapUserPcInput[y][x] = "-";
                    System.out.println("You missed");
                    count++;
                    // oceanMapDisplay(oceanMap);
                } else if (oceanMap[y][x] == "@") {
                    oceanMap[y][x] = "X";
                    oceanMapUserPcInput[y][x] = "X";
                    System.out.println("Oh no, you sunk your own ship :(");
                    bool = true;
                    count++;
                } else if (oceanMap[y][x] == "#") {
                    oceanMap[y][x] = "!";
                    oceanMapUserPcInput[y][x] = "!";
                    System.out.println("Boom! You Sunk the ship!");
                    // playerShipCount++;
                    bool = true;
                    count++;
                }

            }
        }
        oceanMapDisplay(oceanMapUserPcInput);
        mainOceanMap = oceanMap;


        return bool;
    }

    public static boolean computersTurn(String[][] oceanMap) {
        int count = 0;
        boolean bool = false;
        System.out.println("COMPUTER'S TURN");
        oceanMapComputerMiss = oceanMap;
        Random rand = new Random();

        while (count < 1) {
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            if (oceanMapComputerMiss[y][x] == null) {
                oceanMapComputerMiss[y][x] = "-";
                System.out.println("Computer missed");
                count++;
                // oceanMapDisplay(oceanMap);
            } else if (oceanMap[y][x] == "#") {
                oceanMap[y][x] = "!";
                oceanMapUserPcInput[y][x] = "!";
                System.out.println("The Computer sunk one of its own ships");
                bool = true;
                count++;
            } else if (oceanMap[y][x] == "@") {
                oceanMap[y][x] = "X";
                oceanMapUserPcInput[y][x] = "X";
                System.out.println("The Computer sunk one of your ships!");
                count++;

                bool = true;
            }

        }
        oceanMapDisplay(oceanMapUserPcInput);
        return bool;
    }
}