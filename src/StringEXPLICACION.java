import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringEXPLICACION {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String linea = new String();
        int entero;
        float real;
        System.out.printf("Introduce un texto");
        System.out.println();
        linea = read.readLine();
        System.out.printf("%s", linea);
        System.out.printf("Introduce un numero entero");
        System.out.println();
        linea = read.readLine();
        entero = Integer.parseInt(linea);
        System.out.printf("Introduce un numero real");
        System.out.println();
        linea = read.readLine();
        real = Float.parseFloat(linea);
        System.out.printf("%s %d %f", linea, entero, real);

        String cadena1 = new String("Hola");
        String cadena2 = new String();
        int num = 0;
        int resultado = 1;

        //Opcion1 leer una linea
        System.out.println("Nueva linea");
        cadena2 = teclado.nextLine();
        System.out.print(cadena2);
        System.out.println(cadena1.indexOf(cadena2));

        //Opcion2 leer una linea despues de un numero (con String.next());
        System.out.println("Introduzca un numero");
        num = teclado.nextInt();
        System.out.printf("%d", num);
        System.out.println("nueva linea");
        cadena2 = teclado.nextLine();
        System.out.print(cadena2);
        System.out.println(cadena1.indexOf(cadena2));

        //Opcion3 usando InputStreamReader
        System.out.println("Introduce un texto");
        cadena2=teclado.nextLine();
        System.out.printf("%s",cadena2);
        System.out.println(cadena1.indexOf(cadena2));

        //Opcion4 usando InputStreamReader, cuando hay que leer despues de leer numeros
        System.out.println("Introduzca un numero");
        num = teclado.nextInt();
        System.out.printf("%d", num);
        System.out.println("Introduce un texto");
        cadena2=teclado.nextLine();
        System.out.printf("%s",cadena2);
        System.out.println(cadena1.indexOf(cadena2));

        //String Builder
        String chain = "1";
        for (int i = 2; i < 10; i++) {
            System.out.println(chain);
            //cadena = cadena.concat(Integer.toString(i));
            chain = chain.concat(String.valueOf(i));
        }

        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i < 10; i++) {
            System.out.println(sb);
            sb.append(i);
        }
    }
}
