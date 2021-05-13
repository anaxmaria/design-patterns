package Seminar11.ro.ase.cts.Template.main;

import Seminar11.ro.ase.cts.Template.clase.Spectator;
import Seminar11.ro.ase.cts.Template.clase.SpectatorAbstract;
import Seminar11.ro.ase.cts.Template.clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        //ca sa respecti DIP sa declari cu SpectatorAbstract nu Spectator
        SpectatorAbstract spectatorStandard = new Spectator("Jisung");
        SpectatorAbstract spectatorVIP = new SpectatorVIP("Taeyeob");

        spectatorStandard.intrarePeStadion();
        System.out.println("----------------");
        spectatorVIP.intrarePeStadion();
    }
}
