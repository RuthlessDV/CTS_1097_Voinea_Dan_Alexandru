package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
    private static int sumaFinantare = 30;

    public Elev() {
        super();
    }

    public Elev(String nume, String prenume, int varsta, int punctaj,
                int numarProiecte, String[] denumiriProiecte, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, numarProiecte, denumiriProiecte);
        this.clasa = clasa;
        this.tutore = tutore;
    }

	public int getClasa() {
		return this.clasa;
	}

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public String getTutore() {
		return this.tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Clasa=" + this.clasa + ", Tutore=" + this.tutore;
	}

    @Override
    public void afisareFinantare() {
        super.afisareFinantare(Elev.sumaFinantare, "Elev");
    }
}