package ro.ase.cts.clase;

public class Primar {
    private String numeOras;
    private float salariuLunar;
    private int numarSubordonati;
    private String numePartid;

    private static Primar instance = null;

    private Primar() {
        this.numeOras = "Targoviste";
        this.salariuLunar = 70000;
        this.numarSubordonati = 30;
        this.numePartid = "PNL";
    }

    private Primar(String numeOras, float salariuLunar, int numarSubordonati, String numePartid) {
        this.numeOras = numeOras;
        this.salariuLunar = salariuLunar;
        this.numarSubordonati = numarSubordonati;
        this.numePartid = numePartid;
    }

    public static synchronized Primar getInstance(String numeOras, float salariuLunar, int numarSubordonati, String numePartid){
        if(instance == null){
            instance = new Primar(numeOras, salariuLunar, numarSubordonati, numePartid);
        }

        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Primar{");
        sb.append("numeOras='").append(numeOras).append('\'');
        sb.append(", salariuLunar=").append(salariuLunar);
        sb.append(", numarSubordonati=").append(numarSubordonati);
        sb.append(", numePartid='").append(numePartid).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setNumeOras(String numeOras) {
        this.numeOras = numeOras;
    }

    public void setSalariuLunar(float salariuLunar) {
        this.salariuLunar = salariuLunar;
    }

    public void setNumarSubordonati(int numarSubordonati) {
        this.numarSubordonati = numarSubordonati;
    }

    public void setNumePartid(String numePartid) {
        this.numePartid = numePartid;
    }
}
