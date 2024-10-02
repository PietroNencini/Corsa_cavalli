package it.nencini;

public class HorseRunner extends Thread {

    private static int id_count = 1;
    int horseId;

    public HorseRunner() {
        this.horseId = id_count;
        id_count++;
    }

    @Override
    public void run() {
        for(int i = 0; i < 15; i++) {
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
