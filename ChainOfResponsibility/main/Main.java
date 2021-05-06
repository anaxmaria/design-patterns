package Seminar10.ro.ase.cts.ChainOfResponsibility.main;

import Seminar10.ro.ase.cts.ChainOfResponsibility.clase.Client;
import Seminar10.ro.ase.cts.ChainOfResponsibility.clase.NotificareEmail;
import Seminar10.ro.ase.cts.ChainOfResponsibility.clase.NotificareSms;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Eunwoo", null, null);
        Client client2 = new Client("Moonbin", "07863728837", null);
        Client client3 = new Client("Minhyuk", null, "rocky@gmail.kr");

        NotificareSms notificareSms = new NotificareSms();
        NotificareEmail notificareEmail = new NotificareEmail();
        notificareSms.trimiteNotificare(client1, "Mesaj1"); //nu avem succesor=> se duce la manager
        notificareSms.trimiteNotificare(client3, "Mesaj1"); //nu avem succesor=> se duce la manager

        notificareSms.setNotificator(notificareEmail); //acum avem succesor
        notificareSms.trimiteNotificare(client3, "Mesaj1"); //email
        notificareSms.trimiteNotificare(client2, "Mesaj1"); //sms

    }
}
