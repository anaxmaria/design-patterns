package Seminar10.ro.ase.cts.State.clase;

public class Masa {
    private State stare;
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new StareLibera();
    }

    public State getStare() {
        return stare;
    }

    protected void setStare(State stare) {
        this.stare = stare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void rezervaMasa(){
        StareRezervata rezervata = new StareRezervata();
        rezervata.modificaStare(this);
    }

    public void ocupaMasa(){
        StareOcupata ocupata = new StareOcupata();
        ocupata.modificaStare(this);
    }

    public void elibereazaMasa(){
        StareLibera libera = new StareLibera();
        libera.modificaStare(this);
    }
}
