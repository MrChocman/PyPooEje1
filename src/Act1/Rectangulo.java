package Act1;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;

    }

    public void setEsquina1(Coordenada coo) {
        this.esquina1 = coo;
    }

    public void setEsquina2(Coordenada coo) {
        this.esquina2 = coo;
    }

    public Coordenada getEsquina1() {
        return this.esquina1;
    }

    public Coordenada getEsquina2() {
        return this.esquina2;
    }

    public double areaRec() {
        double area = (esquina1.getX() - esquina2.getX()) * (esquina1.getY() - esquina2.getY());

        return Math.abs(area);
    }

    @Override
    public String toString() {
        return "[" + esquina1.toString() + "," + esquina2.toString() + "]";
    }

}
