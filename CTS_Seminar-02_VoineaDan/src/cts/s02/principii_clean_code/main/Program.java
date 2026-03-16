package cts.s02.principii_clean_code.main;

import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.readers.AplicantReader;
import cts.s02.principii_clean_code.readers.StudentReader;

public class Program {

	public static void main(String[] args) {
		try {
            List<Aplicant> listaStudenti;
            AplicantReader readerStudenti = new StudentReader();
            listaStudenti = readerStudenti.citireAplicanti("C:\\Users\\stud\\Downloads\\CTS_Seminar-03_Cod-seminar-02\\CTS_Seminar-02_Cod-initial_2\\CTS_Seminar-02_Cod-initial\\studenti.txt");
            for (Aplicant student : listaStudenti)
                System.out.println(student.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
