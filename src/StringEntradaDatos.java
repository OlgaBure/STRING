import java.util.Scanner;

public class StringEntradaDatos {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String cadena = new String();
        int num_palabras = 0;
        float resultado=1;
       /* //Metodo nextLine sirve para leer una frase hasta introducir un enter
        System.out.println("Introduce una frase");
        cadena = read.nextLine();
        System.out.println(cadena);*/

        //Metodo next permite obtener el siguiente "token" del texto utilizando como delimitador el espacio en blanco.
        //Metodo hastNext().
        System.out.println("Introduzca una frase que la voy a descomponer en palabras. Introduzca la palabra FIN para acaabr.");
        while (!read.hasNext("FIN")){ //mira si el siguiente token o palabra es la palabra FIN
            cadena=read.nextLine();
            System.out.println(cadena);
            num_palabras++;
        }
        System.out.printf("%d",num_palabras);
        //3 Cambiando el delimitador
        cadena=read.next();//avanzo el FIN previo
         read.useDelimiter(";");
        System.out.println("Introduzca una frase que la voy a descomponer en palabras. Introduzca la palabra FIN para acaabr.");
        num_palabras=0;
        while(!read.hasNext("FIN")){
            cadena=read.next();
            System.out.println(cadena);
            num_palabras++;
        }
        System.out.printf("%d",num_palabras);

        //4 Como analizador lexico directamente sobre un String
        num_palabras=0;
        Scanner analizador = new Scanner("hola como estas FIN");
        while (!analizador.hasNext("FIN")){
            cadena= analizador.next();
            System.out.println(cadena);
            num_palabras++;
        }
        System.out.printf("%d", num_palabras);
    }
}
