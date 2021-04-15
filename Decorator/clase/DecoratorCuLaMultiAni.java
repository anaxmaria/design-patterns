package Seminar8.ro.ase.cts.Decorator.clase;

public class DecoratorCuLaMultiAni extends DecoratorAbstract {

    public DecoratorCuLaMultiAni(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        //asta e efectiv noua functionalitate adaugata
        System.out.println("Felicitare - La multi ani!");
    }

    @Override
    public void printeaza() {
        //aici adaugam ceva pe NOTA, nu pe o felicitare SEPARATA
        super.printeaza();
        System.out.println("La multi ani!");
    }
}
