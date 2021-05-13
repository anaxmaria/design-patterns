package Seminar11.ro.ase.cts.Observer.clase;

public class Manager extends ManagerSalaDeSportAbstract {
    public void anuntaMeci(String tipMeci){
        super.trimiteMesajCatreObservatori("Va avea loc un meci de "+ tipMeci + "!");
    }

    //daca vrem sa complicam: managerul poate avea si atribute
    //gen nume, sala de sport etc. si mesajul sa tina cont si de atributele astea
}
