/**
 * Created by Abhijith on 09-Nov-17.
 */
import java.util.*;
public class BattleShips {
    public static void main(String [] args){
oceanMap();
    }
    public static void oceanMap(){
        String [][] oceanMap = new String[10][10];
        System.out.println("**** Welcome to Battle Ships game ****\n Right now, the sea is empty");
        for(int i = 0; i < oceanMap.length;i++){
            System.out.print(i + "|");
            for(int j = 0; j < oceanMap.length;j++){
                if(oceanMap[i][j] == null){
                    System.out.print(" ");
                }
                else {
                    System.out.print(oceanMap[i][j]);
                }
            }
            System.out.println("|" +i);
        }
    }
}
