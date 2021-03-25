package Seminar5.ro.ase.cts.programPrototype;

import Seminar5.ro.ase.cts.clasePrototype.AbstractPrototype;
import Seminar5.ro.ase.cts.clasePrototype.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta("Paracetamol",250 );
        Reteta reteta1 = (Reteta) reteta.copiaza();
        //cast sau AbstractPrototype la declarare in loc de Reteta
        AbstractPrototype reteta2 = reteta.copiaza();

        System.out.println(reteta);
        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}
