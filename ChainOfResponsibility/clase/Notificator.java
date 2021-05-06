package Seminar10.ro.ase.cts.ChainOfResponsibility.clase;

public abstract class Notificator {
    private Notificator notificator;

    public abstract void trimiteNotificare(Client client, String text);

    public void setNotificator(Notificator notificator) {
        this.notificator = notificator; //setam succesorul
    }

    public Notificator getNotificator() {
        return notificator;
    }
}
