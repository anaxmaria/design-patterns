package Seminar9.ro.ase.cts.Flyweight.main;

import Seminar9.ro.ase.cts.Flyweight.clase.Client;
import Seminar9.ro.ase.cts.Flyweight.clase.Flyweight;
import Seminar9.ro.ase.cts.Flyweight.clase.FlyweightFactory;
import Seminar9.ro.ase.cts.Flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(5, 2, 15);
        Rezervare rezervare2 = new Rezervare(2, 1, 16);
        Rezervare rezervare3 = new Rezervare(11, 4, 20);
        Rezervare rezervare4 = new Rezervare(8, 4, 19);

        //pt a crea clienti avem nevoie de un Factory
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight client1 = flyweightFactory.getFlyweight("0763636888");
        client1.printeazaRezervare(rezervare1);

        flyweightFactory.getFlyweight("0763636888").printeazaRezervare(rezervare2);
        flyweightFactory.getFlyweight("0763636777").printeazaRezervare(rezervare3);
        flyweightFactory.getFlyweight("0763636888").printeazaRezervare(rezervare4);

    }
}
