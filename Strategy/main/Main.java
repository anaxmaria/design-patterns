package Seminar10.ro.ase.cts.Strategy.main;

import Seminar10.ro.ase.cts.Strategy.clase.Client;
import Seminar10.ro.ase.cts.Strategy.clase.PlataCard;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Maria");
        client1.platesteNota(30);
        client1.setModalitatePlata(new PlataCard());
        client1.platesteNota(25);
    }
}
