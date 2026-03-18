package Act1;

public class ContainerRect {

    public static int numRec = 0;
    private Rectangulo[] rec;
    private Double[] dist;
    private Double[] area;
    private int totaln;

    public ContainerRect(int n) {
        this.rec = new Rectangulo[n];
        this.dist = new Double[n];
        this.area = new Double[n];
        totaln = n;

    }

    public void addRectangulo(Rectangulo A) {

        try {
            if (ContainerRect.numRec <= totaln) {
                rec[numRec] = A;
                dist[numRec] = Coordenada.distancia(A.getEsquina1(), A.getEsquina2());
                area[numRec] = A.areaRec();

                ContainerRect.numRec++;
            }
        } catch (Exception e) {
            System.err.println("ERROR, INDEX OUT OF BOUNDS, NO INGRESAR MAS RECTANGULOS");
        }

    }

    @Override
    public String toString() {
        System.out.println("RECTANGULO          COORDENADAS                 DISTANCIA                           AREA");
        for (int i = 1; i <= ContainerRect.numRec; i++) {
            System.out.println(
                    i + "                  " + rec[i - 1] + "         " + dist[i - 1] + "         " + area[i - 1]);
        }
        System.out.println("Total de rectangulos: " + ContainerRect.numRec);

        return " ";

    }

}
