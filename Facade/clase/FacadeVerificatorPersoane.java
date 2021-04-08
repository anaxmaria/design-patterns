package Seminar7.ro.ase.cts.Facade.clase;

public class FacadeVerificatorPersoane {
    //functie care ne returneaza daca pers e eligibila

    //pt ca am facut o functie, in main nu trb sa mai creez o fatada
    public static boolean esteEligibil(Persoana persoana){
        //verificam cum zice in cerinte
        //verif varsta, daca e urmarit de politie, daca are credite
        if(persoana.getVarsta() >= 18){
            if(!Politie.esteUrmarit(persoana)){
               if(!BirouDeCredite.areCredit(persoana)){
                   return true;
               }
            }
        }
        return false;
    }
}
