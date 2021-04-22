package Seminar9.ro.ase.cts.Command.clase;

public class ComandaOcupare extends Comanda{

    public ComandaOcupare(Masa masa) {
        super(masa);
    }

    @Override
    public void executa() {
        super.masa.ocupaMasa();
    }
}
