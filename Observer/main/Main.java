package Seminar11.ro.ase.cts.Observer.main;

import Seminar11.ro.ase.cts.Observer.clase.Client;
import Seminar11.ro.ase.cts.Observer.clase.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Client client1 = new Client("Junji");
        Client client2 = new Client("Yoojung");
        Client client3 = new Client("Wookjin");

        manager.adaugaObservator(client1);
        manager.adaugaObservator(client2);
        manager.adaugaObservator(client3);

        manager.anuntaMeci("handbal");

        manager.stergeObservator(client3); //primesc toti
        System.out.println("----------------");

        manager.anuntaMeci("fotbal"); //primesc 2, ca unul s-a dezabonat
    }
}
