package it.nencini;

import java.util.ArrayList;

public class Main {

    private final static int NUM_HORSE = 10000;
    public static ArrayList<HorseRunner> classifica = new ArrayList<>();        // Lista della classifica
    public static void main(String[] args) throws Exception{
        Ranking ranking = new Ranking();
        ArrayList<HorseRunner> runners = new ArrayList<>(NUM_HORSE);
        System.out.println("Corsa dei cavalli \n\n");
        for(int i = 0; i< NUM_HORSE; i++) {
            runners.add(new HorseRunner(ranking));
            runners.get(i).start();
        }
        for (HorseRunner horse : runners) {
            horse.join();
        }    
        System.out.println("CLASSIFICA FINALE" + ranking.toString());
    }
}