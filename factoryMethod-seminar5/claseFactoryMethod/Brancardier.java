package Seminar5.ro.ase.cts.claseFactoryMethod;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nBrancardier: " + super.getNume();
    }

}
