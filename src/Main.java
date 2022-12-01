import Model.players;
import Model.group;
import Model.team;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        players p1 = new players("Tatsam",77,17,6);
        players p2 = new players("Arpan",52,17,3);
        players p3 = new players("Aaditya",43,17,1);
        players p4 = new players("Arunesh",46,17,4);
        players p5 = new players("Avarna",42,17,2);
        players p6 = new players("Keeper",23,15,5);

        team t1 = new team("t2");

        group g1 = new group("karnali_gang","light_green",7);

        ArrayList<players> playerList = new ArrayList<>();

        playerList.add(p1);
        System.out.println(playerList);



    }

}