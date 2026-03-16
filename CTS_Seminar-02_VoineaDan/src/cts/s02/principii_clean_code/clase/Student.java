package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
    private static int sumaFinantare = 10;

    public Student() {
        super();
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, numarProiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

	public String getFacultate() {
		return this.facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return this.anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		return super.toString() + "Facultate=" + this.facultate + ", An studii=" + this.anStudii ;
	}

    @Override
    public void afisareFinantare() {
        super.afisareFinantare(sumaFinantare, "Student");
    }
	
}