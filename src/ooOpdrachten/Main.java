package ooOpdrachten;

public class Main {
    public static void main(String[] args) {

        // auto
        Auto auto = new Auto("Tesla", "rood");
        auto.rijden();
        auto.rijden();
        auto.rijden();
        System.out.println("auto snelheid: " + auto.getSnelheid());

        // vrachtauto
        VrachtAuto vrachtauto = new VrachtAuto("suzuki", "rood");
        vrachtauto.rijden();
        vrachtauto.rijden();
        vrachtauto.rijden();
        System.out.println("vrachtauto snelheid: " + vrachtauto.getSnelheid());

        // raceauto
        RaceAuto raceauto = new RaceAuto("Ferrari", "rood");
        raceauto.setTopSnelheid(250);
        System.out.println("raceauto topsnelheid: " + raceauto.getTopSnelheid());

        // fiets
        Fiets fiets = new Fiets("VanMook", "grijs");
    }
}
