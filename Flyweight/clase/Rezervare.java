package Seminar9.ro.ase.cts.Flyweight.clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private int ore;

    public Rezervare(int nrMasa, int nrPersoane, int ore) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.ore = ore;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ore=").append(ore);
        sb.append('}');
        return sb.toString();
    }
}
