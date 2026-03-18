package Act1;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int op = 1;

        ContainerRect cn = new ContainerRect(2);

        while (op == 1) {
            System.out.println("INGRESE UNA ESQUINA DEL RECTANGULO: ");
            System.out.print("COORDENADA X: ");
            double x1 = scan.nextDouble();
            System.out.print("COORDENADA Y: ");
            double y1 = scan.nextDouble();

            System.out.println("INGRESE UNA ESQUINA OPUESTA DEL RECTANGULO: ");
            System.out.print("COORDENADA X: ");
            double x11 = scan.nextDouble();
            System.out.print("COORDENADA Y: ");
            double y11 = scan.nextDouble();

            Rectangulo A = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x11, y11));

            cn.addRectangulo(A);

            System.out.println("Desea continuar? (1 = si / 0 = no");

            op = scan.nextInt();

        }

        cn.toString();

        scan.close();

    }
}