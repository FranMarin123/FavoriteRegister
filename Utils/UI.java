package Utils;

import java.util.Scanner;

public class UI {
    public static void pressEnter() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Press enter to continue.");
        teclado.nextLine();
    }

    public static int readInt(String msg) {
        int numEleccion = 0;
        Scanner teclado = new Scanner(System.in);
        try {
            numEleccion = teclado.nextInt();
        } catch (Exception e) {
            teclado.nextLine();
            System.out.println("You have to select an option gave you before");
        }
        return numEleccion;
    }
}
