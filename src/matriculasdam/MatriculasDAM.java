package matriculasdam;

import java.util.Scanner;

public class MatriculasDAM {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int uf = 0, precio = 0;
        String error = "";
        System.out.println("Introduce el numero de UF's a las que te vas a matricular");
        do {
            while (!lector.hasNextInt()) {
                error = lector.next();
                System.out.print("Dada introduida incorrecte, introdueix un numero valid: ");
            }
            uf = lector.nextInt();
            if (uf < 12) {
                precio = uf * 30;
                break;
            } else {
                precio = 380;
                break;
            }
        } while (true);
        System.out.println("El precio total matriculandote a " + uf + " UF's es de: " + precio + "€");
    }
}
