package Seminar7.ro.ase.cts.Proxy.clase;

public class ProxyOperatorCredite implements IOperatorCredite{
    private OperatorCredite operatorCredite;

    public ProxyOperatorCredite(OperatorCredite operatorCredite) {
        this.operatorCredite = operatorCredite;
    }

    @Override
    public void creareCredit(Moneda moneda, int suma) {
        //aici apelam fct din clasa de baza doar daca moneda e RON
        if(moneda == Moneda.RON){
            operatorCredite.creareCredit(moneda,suma);
        }
        else{
            System.out.println("Banca ofera doar credite in RON momentan");
        }
    }
}
