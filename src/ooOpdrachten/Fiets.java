package ooOpdrachten;

public class Fiets implements Voertuig {

    private String merk;
    private String kleur;
    private int snelheid;

    public Fiets(String merk, String kleur) {
        this.merk = merk;
        this.kleur = kleur;
    }

    public void rijden() {
        snelheid += 10;
    }

    public void remmen() {
        snelheid -= 10;
    }
}
