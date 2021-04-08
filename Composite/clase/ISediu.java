package Seminar7.ro.ase.cts.Composite.clase;

public interface ISediu {
    public void afiseazaDescriere();
    public void addNode(ISediu sediu) throws Exception; //adaugaFiliala
    public void deleteNode(ISediu sediu) throws Exception;
    public ISediu getNode(int pozitie) throws Exception;
}
