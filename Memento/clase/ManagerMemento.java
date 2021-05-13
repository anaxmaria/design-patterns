package Seminar11.ro.ase.cts.Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento> listaMemento;

    public ManagerMemento() {
        this.listaMemento = new ArrayList<>();
    }

    public void adaugareMemento(Memento memento){
        listaMemento.add(memento);
    }

    public Memento cereUnMemento(int index){
        //il ceri pt a trimite; aici NU il returnam pe ultimul ca la CTRL+Z
        if(index <listaMemento.size() && index >= 0){
            return listaMemento.get(index);
        }
        return null;
    }

    public Memento cereUltimulMemento(){
        //aici facem ctrl+z
        return listaMemento.get(listaMemento.size()-1);
    }
}
