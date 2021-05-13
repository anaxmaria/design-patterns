package Seminar11.ro.ase.cts.Memento.main;

import Seminar11.ro.ase.cts.Memento.clase.ManagerMemento;
import Seminar11.ro.ase.cts.Memento.clase.Meci;
import Seminar11.ro.ase.cts.Memento.clase.Memento;
import Seminar11.ro.ase.cts.Observer.clase.Manager;

public class Main {
    public static void main(String[] args) {
        Meci meci = new Meci("Bucuresti", "Tg. Mures", 200, 139, 10, 5);
        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.adaugareMemento(meci.creeazaMemento());

        meci.setNrSpectatori(180);
        managerMemento.adaugareMemento(meci.creeazaMemento());
        //acum avem salvate 2 stari

        System.out.println(meci.toString());//asta e meciul de acum
        meci.seteazaMemento(managerMemento.cereUnMemento(0));
        System.out.println(meci.toString());

        meci.seteazaMemento(managerMemento.cereUltimulMemento());
        System.out.println(meci.toString());

    }
}
