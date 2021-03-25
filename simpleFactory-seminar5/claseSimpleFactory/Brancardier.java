package Seminar5.ro.ase.cts.claseSimpleFactory;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nBrancardier: " + super.getNume();
    }

}
