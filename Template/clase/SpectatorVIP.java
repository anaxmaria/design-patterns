package Seminar11.ro.ase.cts.Template.clase;

public class SpectatorVIP extends SpectatorAbstract {
    private String numeSpectator;

    public SpectatorVIP(String numeSpectator) {
        this.numeSpectator = numeSpectator;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println("Spectatorul VIP " + numeSpectator + " nu a mai fost nevoit sa stea la coada.");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("Spectatorul VIP " + numeSpectator + " a prezentat biletul.");
    }

    @Override
    public void realizareControlCorporal() {
        System.out.println("Spectatorul VIP " + numeSpectator + " a fost controlat.");
    }

    @Override
    public void ocupaLoc() {
        System.out.println("Spectatorul VIP " + numeSpectator + " si-a ocupat locul in loja.");
    }
}
