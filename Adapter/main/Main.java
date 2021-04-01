package Adapter.main;

import Adapter.clase.Bilet;
import Adapter.clase.BiletAdapter;
import Adapter.clase.BiletAdapterClass;
import Adapter.clase.IBiletOnline;

public class Main {

    private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet){
        bilet.rezervare();
        bilet.vanzare();
    }

    private static void rezervaSiAfiseazaBiletOnline(IBiletOnline biletOnline){
        biletOnline.rezervaBiletOnline();
        biletOnline.vindeBiletOnline();
    }

    public static void main(String[] args) {
        //adapter de obiecte
        Bilet bilet = new Bilet(12.5f); //creez un obiect pe care-l adaptez
        rezervaSiAfiseazaBiletLaCasa(bilet);

        IBiletOnline adaptor = new BiletAdapter(bilet);
        rezervaSiAfiseazaBiletOnline(adaptor);

        //adapter de clase
        IBiletOnline adapterClass = new BiletAdapterClass(55);
        rezervaSiAfiseazaBiletOnline(adapterClass);
    }
}
