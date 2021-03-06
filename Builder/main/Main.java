package Builder.main;

import Builder.clase.Rezervare;
import Builder.clase.RezervareBuilder;
import Builder.clase.RezervareBuilderV2;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1;
        //Rezervare rezervare2;

        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        rezervareBuilder.setCodRezervare(100).setAreMancare(true);
        rezervare1 = rezervareBuilder.build();

        Rezervare rezervare2 = new RezervareBuilder(101).setAreMuzica(true).build();

        Rezervare rezervare3 = new Rezervare(102,true,
                false,true,true,"pop");

        Rezervare rezervare4;
        rezervareBuilder.setCodRezervare(104).setAreMuzica(true).setAreScaun(true);
        rezervare4 = rezervareBuilder.build();
        //refolosind acelasi builder se face suprascriere; shallow copy

        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
        System.out.println(rezervare4);

        //Builder v2
        //eficienta consta in faptul ca putem refolosi acelasi builder
        //nu mai e nevoie sa construim build-ere diferite
        RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2().setAreMancare(true).setAreBautura(true).setAreScaunErgonomic(true);
        Rezervare rezervare5 = rezervareBuilderV2.setCodRezervare(105).build();
        Rezervare rezervare6 = rezervareBuilderV2.setCodRezervare(106).build();

        System.out.println(rezervare5);
        System.out.println(rezervare6);
    }


}
