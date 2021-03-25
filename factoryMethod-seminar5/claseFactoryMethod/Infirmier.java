package Seminar5.ro.ase.cts.claseFactoryMethod;

public class Infirmier extends PersonalSpital{

    public Infirmier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nInfirmier: " + super.getNume();
    }

}
