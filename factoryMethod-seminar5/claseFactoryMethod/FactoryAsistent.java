package Seminar5.ro.ase.cts.claseFactoryMethod;

public class FactoryAsistent implements IFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Asistent(nume);
    }
}
