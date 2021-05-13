package Seminar11.ro.ase.cts.Template.clase;

public class Spectator extends SpectatorAbstract{
    //putem evident sa dam si atribute
    private String numeSpectator;

    public Spectator(String numeSpectator) {
        this.numeSpectator = numeSpectator;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println("Spectatorul " + numeSpectator + " s-a asezat la coada.");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("Spectatorul " + numeSpectator + " a prezentat biletul.");
    }

    @Override
    public void realizareControlCorporal() {
        System.out.println("Spectatorul " + numeSpectator + " a fost controlat.");
    }

    @Override
    public void ocupaLoc() {
        System.out.println("Spectatorul " + numeSpectator + " si-a ocupat locul.");
    }
}
