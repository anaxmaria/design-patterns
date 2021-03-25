package ro.ase.cts.program;

import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;
import ro.ase.cts.clase.Primar;

public class Program {
    public static void main(String[] args) {

        Presedinte presedinte1 = Presedinte.getInstance();
        Presedinte presedinte2 = Presedinte.getInstance();

        //System.out.println(presedinte1.toString());
        //System.out.println(presedinte2.toString());

        presedinte1.setNume("Basescu");
        presedinte2.setMandat(3);

        //System.out.println(presedinte1.toString());
        //System.out.println(presedinte2.toString());

        PresedinteLazy presedinteLazy1 = PresedinteLazy.getInstance("PresedinteLazy1", 40, 5);
        PresedinteLazy presedinteLazy2 = PresedinteLazy.getInstance("PresedinteLazy2", 54, 9);

        //System.out.println(presedinteLazy1.toString());
        //System.out.println(presedinteLazy2.toString());

        Primar primar1 = Primar.getInstance("Sinaia", 85000, 40, "PSD");
        Primar primar2 = Primar.getInstance("Ploieti", 90000, 65, "PNL");

        System.out.println(primar1.toString());
        System.out.println(primar2.toString());

        primar1.setNumePartid("USR");
        primar2.setNumeOras("Pitesti");

        System.out.println(primar1.toString());
        System.out.println(primar2.toString());
    }
}
