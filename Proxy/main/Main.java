package Seminar7.ro.ase.cts.Proxy.main;

import Seminar7.ro.ase.cts.Proxy.clase.Moneda;
import Seminar7.ro.ase.cts.Proxy.clase.OperatorCredite;
import Seminar7.ro.ase.cts.Proxy.clase.ProxyOperatorCredite;

public class Main {
    public static void main(String[] args) {
        OperatorCredite operatorCredite = new OperatorCredite();
        operatorCredite.creareCredit(Moneda.EUR, 2000);

        ProxyOperatorCredite proxy = new ProxyOperatorCredite(operatorCredite);
        proxy.creareCredit(Moneda.EUR, 5000);
        proxy.creareCredit(Moneda.RON, 8000);

    }
}
