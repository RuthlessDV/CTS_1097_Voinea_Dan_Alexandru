package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
    private static int sumaFinantare = 10;

    public Angajat() {
        super();
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumiriProiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, numarProiecte, denumiriProiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }
	
	public String getOcupatie() {
		return this.ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return this.salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		return super.toString() + "Ocupatie=" + this.ocupatie + ", salariu=" + this.salariu;
	}

    @Override
	public void afisareFinantare() {
        super.afisareFinantare(sumaFinantare, "Angajat");
    }
	
}