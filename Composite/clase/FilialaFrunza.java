package Seminar7.ro.ase.cts.Composite.clase;

public class FilialaFrunza implements ISediu{
    private String numeFiliala;

    public FilialaFrunza(String numeFiliala) {
        this.numeFiliala = numeFiliala;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Este filiala "+ numeFiliala);
    }

    @Override
    public void addNode(ISediu sediu) throws Exception {
        throw new Exception("Not yet implemented.");
    }

    @Override
    public void deleteNode(ISediu sediu) throws Exception {
        throw new Exception("Not yet implemented.");
    }

    @Override
    public ISediu getNode(int pozitie) throws Exception {
        throw new Exception("Not yet implemented.");
    }
}
