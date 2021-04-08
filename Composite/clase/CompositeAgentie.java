package Seminar7.ro.ase.cts.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeAgentie implements ISediu {
    private List<ISediu> listaSedii;
    //pe langa atributul asta, am fi putut avea si un nume etc

    public CompositeAgentie() {
        this.listaSedii = new ArrayList<>();
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Este o agentie.");
        //contine si filiale, le afisam si pe ele
        for(ISediu sediu : listaSedii){
            sediu.afiseazaDescriere();
        }
    }

    @Override
    public void addNode(ISediu sediu) {
        listaSedii.add(sediu);
    }

    @Override
    public void deleteNode(ISediu sediu) {
        listaSedii.remove(sediu);
    }

    @Override
    public ISediu getNode(int pozitie) {
        return listaSedii.get(pozitie);
    }
    //agentia are mai multe filiale

}
