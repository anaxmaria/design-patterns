package Seminar5.ro.ase.cts.clasePrototype;

public class Reteta implements AbstractPrototype{
    private String denumireSolutie;
    private int cantitateSolutie;

    private Reteta() {
        //nu mai face validari
        this.denumireSolutie = "unknown";
        this.cantitateSolutie = 0;
    }

    public Reteta(String denumireSolutie, int cantitateSolutie) {
        //validari
        this.denumireSolutie = denumireSolutie;
        this.cantitateSolutie = cantitateSolutie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireSolutie='").append(denumireSolutie).append('\'');
        sb.append(", cantitateSolutie=").append(cantitateSolutie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractPrototype copiaza() {
        Reteta copie = new Reteta();
        copie.cantitateSolutie = this.cantitateSolutie;
        copie.denumireSolutie = this.denumireSolutie;
        //pt this stiu ca deja s-au facut validari, de aceea acum atribui direct

        return copie;
    }
}
