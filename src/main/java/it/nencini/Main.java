package it.nencini;

import java.util.ArrayList;

public class Main {

    private final static int NUM_HORSE = 10;
    public static ArrayList<HorseRunner> classifica = new ArrayList<>();        // Lista della classifica
    public static void main(String[] args) throws Exception{
        ArrayList<HorseRunner> runners = new ArrayList<>(10);
        System.out.println("Corsa dei cavalli \n\n");
        for(int i = 0; i< NUM_HORSE; i++) {
            runners.add(new HorseRunner());
            runners.get(i).start();
        }
        for (HorseRunner horse : runners) {
            horse.join();
        }
        
        System.out.println("CLASSIFICA FINALE" + classifica);

    }
}