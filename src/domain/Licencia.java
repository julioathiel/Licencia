package domain;

public class Licencia {

    {
        System.out.println("Que antiguedad tienes?");
    }

    private int  anio;

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void imprimir(int dia) {
        System.out.println("Tienes derecho a " + dia + " dias de vacaciones");
    }

    public void condicion(int anio) {
        if (anio <= 4) {
            imprimir(10);
        } else if (anio <= 9) {
            imprimir(15);
        } else if (anio <= 14) {
            imprimir(20);
        } else if (anio <= 19) {
            imprimir(25);
        } else if (anio <= 29) {
            imprimir(30);
        } else {
            System.out.println("valor no encontrado");
        }
    }
}
        //    public void condicion(int anio) {
//        int val = (anio <= 4) ? 10 : (anio <= 9) ? 15
//                : (anio <= 14) ? 20 : (anio <= 19) ? 25
//                                : (anio <= 29) ? 30 : 0;
//        if (val > 0) {
//            imprimir(val);
//        } else {
//            System.out.println("valor no encontrado");
//        }
//    }
