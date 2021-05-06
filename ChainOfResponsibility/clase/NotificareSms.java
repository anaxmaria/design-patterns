package Seminar10.ro.ase.cts.ChainOfResponsibility.clase;

public class NotificareSms extends Notificator{

    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getNrTelefon() != null){
            System.out.println("Trimitere SMS catre "+client.getNume()+ " :"+text);
        }
        else { //verificam daca avem urmatorul succesor
            if(super.getNotificator() != null) {
                super.getNotificator().trimiteNotificare(client, text);
            }
            else{
                System.out.println("Domnule Manager, nu avem date de contact pentru clientul "+ client.getNume());
            }
        }
    }
}
