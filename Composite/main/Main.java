package Seminar7.ro.ase.cts.Composite.main;

import Seminar7.ro.ase.cts.Composite.clase.CompositeAgentie;
import Seminar7.ro.ase.cts.Composite.clase.FilialaFrunza;

public class Main {
    public static void main(String[] args) {
        CompositeAgentie agentie1 = new CompositeAgentie();
        CompositeAgentie agentie2 = new CompositeAgentie();
        CompositeAgentie agentie3 = new CompositeAgentie();

        FilialaFrunza filiala1 = new FilialaFrunza("Filiala1");
        FilialaFrunza filiala2 = new FilialaFrunza("Filiala2");
        FilialaFrunza filiala3 = new FilialaFrunza("Filiala3");
        FilialaFrunza filiala4 = new FilialaFrunza("Filiala4");

        agentie1.addNode(filiala1);
        agentie1.addNode(filiala2);
        agentie2.addNode(filiala3);
        agentie3.addNode(filiala4);

        agentie1.addNode(agentie3);

        agentie1.afiseazaDescriere();
        System.out.println();
        agentie2.afiseazaDescriere();

        //mut filiala 4 din a3 in a1
        agentie3.deleteNode(filiala4);
        agentie1.addNode(filiala4);
        agentie1.deleteNode(agentie3); //am sters si agentia cu totul

        System.out.println();
        agentie1.afiseazaDescriere();
    }
}
