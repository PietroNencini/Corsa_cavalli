package it.nencini;

public class HorseRunner extends Thread {

    int horseId;

    public HorseRunner(int horseId) {
        this.horseId = horseId;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println(this.horseId + " - " + i);
        }
        finish();
    }

    private synchronized void finish() {
        Main.classifica.add(this);
    }

    @Override
    public String toString() {
        return "Cavallo " + horseId;
    }

}
