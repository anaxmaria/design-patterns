package Adapter.clase;

public class BiletAdapterClass extends Bilet implements IBiletOnline {
    public BiletAdapterClass(float pret) {
        super(pret);
    }

    @Override
    public void vindeBiletOnline() {
        super.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
        super.rezervare();
    }
}
