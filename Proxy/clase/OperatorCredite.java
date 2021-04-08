package Seminar7.ro.ase.cts.Proxy.clase;

public class OperatorCredite implements IOperatorCredite{
    //entitatea
    @Override
    public void creareCredit(Moneda moneda, int suma) {
        System.out.println("A fost creat creditul de "+suma
                    + " "+ moneda);
    }
}
