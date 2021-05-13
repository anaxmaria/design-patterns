package Seminar11.ro.ase.cts.Observer.clase;

public class Client implements Observator{
    //el e observatorul concret
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Dl/Dna "+ nume + ",ati primit urmatoarea notificare: "+mesaj);
    }
}
