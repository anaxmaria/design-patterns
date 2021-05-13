package Seminar11.ro.ase.cts.Memento.clase;

public class Meci {
    //aveam si data
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;
    private int nrBileteVandute;
    private int nrSpectatori;
    private int nrJandarmi;
    private int nrStewarzi;

    public Meci(String numeEchipaGazda, String numeEchipaOaspeti, int nrBileteVandute, int nrSpectatori, int nrJandarmi, int nrStewarzi) {
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
        this.nrBileteVandute = nrBileteVandute;
        this.nrSpectatori = nrSpectatori;
        this.nrJandarmi = nrJandarmi;
        this.nrStewarzi = nrStewarzi;
    }

    public void setNumeEchipaGazda(String numeEchipaGazda) {
        this.numeEchipaGazda = numeEchipaGazda;
    }

    public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    public void setNrStewarzi(int nrStewarzi) {
        this.nrStewarzi = nrStewarzi;
    }

    //metoda de creare memento
    public Memento creeazaMemento(){
        Memento memento = new Memento(this.nrSpectatori, this.numeEchipaGazda, this.numeEchipaOaspeti);
        return memento;
    }

    public void seteazaMemento(Memento memento){
        this.nrSpectatori = memento.getNrSpectatori();
        this.numeEchipaGazda = memento.getNumeEchipaGazda();
        this.numeEchipaOaspeti = memento.getNumeEchipaOaspeti();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meci{");
        sb.append("numeEchipaGazda='").append(numeEchipaGazda).append('\'');
        sb.append(", numeEchipaOaspeti='").append(numeEchipaOaspeti).append('\'');
        sb.append(", nrBileteVandute=").append(nrBileteVandute);
        sb.append(", nrSpectatori=").append(nrSpectatori);
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append(", nrStewarzi=").append(nrStewarzi);
        sb.append('}');
        return sb.toString();
    }
}
