package it.nencini;

import java.util.ArrayList;

public class Main {

    public static ArrayList<HorseRunner> classifica = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        System.out.println("Corsa dei cavalli \n\n");
        HorseRunner hr1 = new HorseRunner(1);
        HorseRunner hr2 = new HorseRunner(2);
        HorseRunner hr3 = new HorseRunner(3);
        HorseRunner hr4 = new HorseRunner(4);
        hr1.start();
        hr2.start();
        hr3.start();
        hr4.start();
        hr1.join();
        hr2.join();
        hr3.join();
        hr4.join();

        System.out.println("CLASSIFICA FINALE" + classifica);

    }
}