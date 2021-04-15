package Seminar8.ro.ase.cts.Decorator.main;

import Seminar8.ro.ase.cts.Decorator.clase.DecoratorAbstract;
import Seminar8.ro.ase.cts.Decorator.clase.DecoratorCuLaMultiAni;
import Seminar8.ro.ase.cts.Decorator.clase.DecoratorPasteFericit;
import Seminar8.ro.ase.cts.Decorator.clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaInitiala = new NotaDePlata(55);
        notaInitiala.printeaza();

        System.out.println("----------");

        //o decoram cu la multi ani
        DecoratorAbstract decoratorLaMultiAni = new DecoratorCuLaMultiAni(notaInitiala);
        decoratorLaMultiAni.printeaza(); //printeaza lma pe nota
        decoratorLaMultiAni.printeazaFelicitare(); //printeaza o felicitare separata cu lma

        System.out.println("----------");

        //o decoram cu paste fericit
        DecoratorAbstract decoratorPasteFericit = new DecoratorPasteFericit(notaInitiala);
        decoratorPasteFericit.printeaza();

        System.out.println("----------");

        //vrem sa decoram o nota cu ambele chestii
        NotaDePlata notaDePlata = new NotaDePlata(89);
        DecoratorAbstract decoratorCuLaMultiAni2 = new DecoratorCuLaMultiAni(notaDePlata);
        DecoratorAbstract decoratorPasteFericit2 = new DecoratorPasteFericit(decoratorCuLaMultiAni2); //nu decoram obj initial!!
        decoratorPasteFericit2.printeaza();

    }
}
