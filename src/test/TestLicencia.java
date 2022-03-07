package test;

import domain.Licencia;
import java.util.Scanner;

public class TestLicencia {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Licencia lic = new Licencia();
        lic.setAnio(in.nextInt());
        lic.condicion(lic.getAnio());
    }
}
