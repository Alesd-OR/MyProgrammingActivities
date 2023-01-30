//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas

import java.util.Scanner;

public class differenceBetweenHours {
    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);

        System.out.println("Write the inicial time: ");
        int inicialTime = oli.nextInt();
        System.out.println("write the final time: ");
        int finalTime = oli.nextInt();

        int time;
        if (inicialTime < finalTime) {
            time = finalTime - inicialTime;
        } else {
            time = 24 - inicialTime + finalTime;
        }

        System.out.println("The game had " + time + " hours");
        oli.close();
    }

}
