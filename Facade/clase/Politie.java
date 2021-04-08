package Seminar7.ro.ase.cts.Facade.clase;

class Politie {
    public static boolean esteUrmarit(Persoana persoana){
        //functie nu metoda
        //in mod normal aici ar trb sa avem o lista de persoane si sa
        //verificam daca persoana primita e in lista
        //dar noi facem ceva pe baza unei cifre din cnp

        if(Integer.parseInt(""+ persoana.getCnp().charAt(12)) % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
