package Seminar10.ro.ase.cts.State.clase;

public class StareRezervata implements State {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            System.out.println("Masa cu numarul "+masa.getNrMasa()+" este rezervata.");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa nu poate fi rezervata.");
        }
    }
}
