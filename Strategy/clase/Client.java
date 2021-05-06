package Seminar10.ro.ase.cts.Strategy.clase;

public class Client {
    private IPlata modalitatePlata;
    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
        this.modalitatePlata = new PlataCash();
    }

    public void setModalitatePlata(IPlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void platesteNota(float sumaDePlata){
        System.out.println("Clientul " + this.numeClient + " efectueaza urmatoarea plata: ");
        this.modalitatePlata.plateste(sumaDePlata);
    }
}
