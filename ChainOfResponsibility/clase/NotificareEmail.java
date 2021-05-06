package Seminar10.ro.ase.cts.ChainOfResponsibility.clase;

public class NotificareEmail extends Notificator {
    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getEmail() != null){
            System.out.println("Trimitere email catre clientul: "+client.getNume()+" :"+text);
        }
        else{
            if(super.getNotificator() != null){
                super.getNotificator().trimiteNotificare(client,text);
            }
            else{
                System.out.println("Domnule Manager, nu avem date de contact pentru clientul "+ client.getNume());
            }
        }
    }
}
