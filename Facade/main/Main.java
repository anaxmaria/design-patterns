package Seminar7.ro.ase.cts.Facade.main;

import Seminar7.ro.ase.cts.Facade.clase.FacadeVerificatorPersoane;
import Seminar7.ro.ase.cts.Facade.clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Andrei", "1990834238755");

        if(FacadeVerificatorPersoane.esteEligibil(persoana)){
            System.out.println("Creditul poate fi oferit");
        }
        else{
            System.out.println("Creditul nu poate fi oferit");
        }
    }
}
