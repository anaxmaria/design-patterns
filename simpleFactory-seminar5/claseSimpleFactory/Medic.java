package Seminar5.ro.ase.cts.claseSimpleFactory;

public class Medic extends PersonalSpital {

    public Medic(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nMedic: " +  super.getNume();
    }
}
