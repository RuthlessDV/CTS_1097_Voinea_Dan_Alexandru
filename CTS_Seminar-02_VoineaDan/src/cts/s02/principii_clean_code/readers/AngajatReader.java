package cts.s02.principii_clean_code.readers;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader{
    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(numeFisier));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while(scanner.hasNext()) {
            Angajat angajat = new Angajat();
            super.citireAplicant(scanner, angajat);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        scanner.close();

        return angajati;
    }
}
