package it.nencini;

public class HorseRunner extends Thread {

    private static int id_count = 1;
    int horseId;
    Ranking ranking; 

    public HorseRunner(Ranking r) {
        this.ranking = r;
        this.horseId = id_count;
        id_count++;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            try {
                Thread.sleep((int) Math.random() * 1600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.horseId + " - " + i);
        }
        finish();
    }

    private void finish() {
        ranking.addCompletedHorse(this);
    }

    @Override
    public String toString() {
        return "Cavallo " + horseId;
    }

}
