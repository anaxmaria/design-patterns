package Seminar5.ro.ase.cts.claseSimpleFactory;

public class Asistent extends PersonalSpital {

    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nAsistent: " + super.getNume();
    }
}
