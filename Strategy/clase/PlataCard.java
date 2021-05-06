package Seminar10.ro.ase.cts.Strategy.clase;

public class PlataCard implements IPlata{
    @Override
    public void plateste(float sumaDePlata) {
        System.out.println("A fost efectuata plata cu cardul in valoare de " + sumaDePlata + " lei.");
    }
}
