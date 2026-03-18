package Act1;

public class Coordenada {
    private double x;
    private double y;

    public Coordenada() {
    }

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada c) {
        this.x = c.x;
        this.y = c.y;
    }

    double getX() {
        return x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return y;
    }

    void setY(double y) {
        this.y = y;
    }

    double distancia(Coordenada c) {
        double deuc;
        deuc = Math.sqrt(Math.pow((this.x - c.x), 2) + Math.pow((this.y - c.y), 2));
        return deuc;
    }

    static double distancia(Coordenada c1, Coordenada c2) {
        return c1.distancia(c2);
    }

    @Override
    public String toString() {
        return "[" + this.x + "," + this.y + "]";
    }

}
