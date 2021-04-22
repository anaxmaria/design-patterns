package Seminar9.ro.ase.cts.Command.clase;

public abstract class Comanda {
    protected Masa masa; //private => getter

    public Comanda(Masa masa) {
        this.masa = masa;
    }

    public abstract void executa();
}
