//Read the start time and end time of a game. Then calculate the duration of the game, knowing that it can 
//start in one day and end in another, having a minimum duration of 1 hour and maximum of 24 hours.

import java.util.Scanner;

public class differenceBetweenHours {
    public static void main(String[] args) {

        Scanner ale = new Scanner(System.in);

        System.out.println("Write the inicial time: ");
        int inicialTime = ale.nextInt();
        System.out.println("write the final time: ");
        int finalTime = ale.nextInt();

        int time;
        if (inicialTime < finalTime) {
            time = finalTime - inicialTime;
        } else {
            time = 24 - inicialTime + finalTime;
        }

        System.out.println("The game had " + time + " hours");
        ale.close();
    }

}
