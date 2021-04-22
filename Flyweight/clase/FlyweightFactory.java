package Seminar9.ro.ase.cts.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> colectieClienti;

    public FlyweightFactory() {
        this.colectieClienti = new HashMap<>();
    }

    public Flyweight getFlyweight(String nrTelefon){
        if(colectieClienti.containsKey(nrTelefon)){
            return colectieClienti.get(nrTelefon); //aici se face SHALLOW COPY
        }
        else{
            Client client = new Client("-", nrTelefon, "-");
            colectieClienti.put(nrTelefon,client);

            return client; //sau return colectieClienti.get(nrTelefon) it's the same
        }
    }
}
