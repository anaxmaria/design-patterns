package Seminar8.ro.ase.cts.Decorator.clase;

public abstract class DecoratorAbstract implements INota{
    private INota nota;

    public DecoratorAbstract(INota nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }

    //anuntam noua functionalitate
    public abstract void printeazaFelicitare();
}
