package Seminar10.ro.ase.cts.State.main;

import Seminar10.ro.ase.cts.State.clase.Masa;
import Seminar10.ro.ase.cts.State.clase.StareLibera;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(7);

        masa.elibereazaMasa(); //e deja libera by default
        masa.rezervaMasa();
        masa.rezervaMasa(); //nu va putea fi rezervata, e deja
        //masa.setStare(new StareLibera());
        //masa.rezervaMasa(); //acum ne lasa sa o rezervam (de 2 ori)
        //am facut setStare protected ca sa evitam sa se intample ce am ilustrat ^^
        masa.ocupaMasa();
        masa.elibereazaMasa();
    }
}
