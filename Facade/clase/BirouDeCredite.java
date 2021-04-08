package Seminar7.ro.ase.cts.Facade.clase;

class BirouDeCredite {
    public static boolean areCredit(Persoana persoana){
        return Integer.parseInt(""+ persoana.getCnp().charAt(11)) % 2 == 0;
        //acelasi lucru ca in clasa Politie dar scris pe o singura linie
    }
}
