package Seminar11.ro.ase.cts.Template.clase;

public abstract class SpectatorAbstract {
    //metodele specifice fiecarui pas
    public abstract void asezareLaCoada();
    public abstract void prezentareBilet();
    public abstract void realizareControlCorporal();
    public abstract void ocupaLoc();

    //metoda finala
    public final void intrarePeStadion(){
        asezareLaCoada();
        prezentareBilet();
        realizareControlCorporal();
        ocupaLoc();
    }
}
