package codingame.monnaie;

public class Monnaie {

    private long monnaie2;
    private long monnaie5;
    private long monnaie10;
    private long reste;

    public Monnaie() {
        this.monnaie2 = 0;
        this.monnaie5 = 0;
        this.monnaie10 = 0;
    }

    public long getMonnaie2() {
        return monnaie2;
    }

    public long getMonnaie5() {
        return monnaie5;
    }

    public long getMonnaie10() {
        return monnaie10;
    }

    public long getReste() {
        return reste;
    }

    public void setMonnaie2(long monnaie2) {
        this.monnaie2 = monnaie2;
    }

    public void setMonnaie5(long monnaie5) {
        this.monnaie5 = monnaie5;
    }

    public void setMonnaie10(long monnaie10) {
        this.monnaie10 = monnaie10;
    }

    public void setReste(long reste) {
        this.reste = reste;
    }

}
