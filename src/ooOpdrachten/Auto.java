package ooOpdrachten;

interface Voertuig {
    public void rijden();
    public void remmen();
}

public class Auto implements Voertuig {
    private String merk;
    private String kleur;
    protected int snelheid;

    public Auto(String merk, String kleur) {
        this.merk = merk;
        this.kleur = kleur;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public void rijden() {
        snelheid += 10;
    }

    public void remmen() {
        snelheid -= 10;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "snelheid=" + snelheid +
                '}';
    }
}
