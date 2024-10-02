package it.nencini;

import java.util.ArrayList;

public class Ranking {
    private ArrayList<HorseRunner> ranking = new ArrayList<>();

    public synchronized void addCompletedHorse(HorseRunner hr) {
        this.ranking.add(hr);
    }

    @Override
    public String toString() {
        return ranking.toString() + "\n Cavalli arrivati a destinazione: " + ranking.size();
    }
}
