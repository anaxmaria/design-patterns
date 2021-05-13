package Seminar11.ro.ase.cts.Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaDeSportAbstract {
    private List<Observator> colectieObservatori;

    public ManagerSalaDeSportAbstract() {
        this.colectieObservatori = new ArrayList<>();
    }

    public void adaugaObservator(Observator observator){
        colectieObservatori.add(observator);
    }

    public void stergeObservator(Observator observator){
        colectieObservatori.remove(observator);
        System.out.println("S-a dezabonat un client.");
    }

    public void trimiteMesajCatreObservatori(String mesajNotificare){
        for(Observator o : colectieObservatori){
            o.primesteMesaj(mesajNotificare);
        }
    }
}
