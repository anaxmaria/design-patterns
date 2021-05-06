package Seminar10.ro.ase.cts.Strategy.clase;

public class PlataCash implements IPlata {
    @Override
    public void plateste(float sumaDePlata) {
        System.out.println("A fost efectuata plata cash in valoare de " + sumaDePlata + " lei.");
    }
}
