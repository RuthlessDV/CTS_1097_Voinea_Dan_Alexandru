package cts.s02.principii_clean_code.readers;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader{

    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        List<Aplicant> studenti = new ArrayList<>();
        Scanner scanner = new Scanner(new File(numeFisier));
        scanner.useDelimiter(",|\n");
        while(scanner.hasNext()) {
            Student student = new Student();
            super.citireAplicant(scanner, student);
            int anStudii = scanner.nextInt();
            String facultate = scanner.next();
            student.setAnStudii(anStudii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        scanner.close();
        return studenti;
    }
}
