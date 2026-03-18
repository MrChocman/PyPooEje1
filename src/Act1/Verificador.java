package Act1;

public class Verificador {

    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
        double r1Izquierda = Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double r1Derecha = Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double r1Abajo = Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY());
        double r1Arriba = Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY());

        double r2Izquierda = Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double r2Derecha = Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double r2Abajo = Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY());
        double r2Arriba = Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY());

        if (r1Derecha <= r2Izquierda || r1Izquierda >= r2Derecha ||
                r1Arriba <= r2Abajo || r1Abajo >= r2Arriba) {
            return false;
        }
        return true;
    }

    public static boolean esJunto(Rectangulo r1, Rectangulo r2) {

        if (esSobrePos(r1, r2))
            return false;

        boolean tocaX = (r1.getEsquina2().getX() == r2.getEsquina1().getX()
                || r1.getEsquina1().getX() == r2.getEsquina2().getX());

        boolean tocaY = (r1.getEsquina2().getY() == r2.getEsquina1().getY()
                || r1.getEsquina1().getY() == r2.getEsquina2().getY());

        return tocaX || tocaY;
    }

    public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {

        return !esSobrePos(r1, r2) && !esJunto(r1, r2);
    }

    public static double Areasobrepos(Rectangulo r1, Rectangulo r2) {
        double iIzq = Math.max(Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX()),
                Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX()));

        double iDer = Math.min(Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX()),
                Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX()));

        double iAbajo = Math.max(Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY()),
                Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY()));

        double iArriba = Math.min(Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY()),
                Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY()));

        double ancho = iDer - iIzq;
        double alto = iArriba - iAbajo;

        return (ancho > 0 && alto > 0) ? ancho * alto : 0;
    }
}