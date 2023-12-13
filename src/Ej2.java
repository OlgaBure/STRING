import java.util.Scanner;
/*2. Hacer un menú que permita al usuario conocer el uso de 5 métodos de la clase StringBuffer.
El programa debe dar la opción 6 para poder salir del mismo.*/
public class Ej2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Introduce una de las 5 opciones y opcion 6 para salir del programa.");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Introduce una opcion valida");
            }
        }while (opcion != 6) ;
    }
}
