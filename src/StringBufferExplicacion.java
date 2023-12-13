import java.util.Scanner;
//introduction to Strings
public class StringBufferExplicacion {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println();
        String str = new String();
       char array[] = {'a','e', 'i', 'o', 'u'};

       // Explicacion de StringBUilder
        String cadena = "1";
        for (int i = 2; i < 10; i++) {
            System.out.println(cadena);
            //cadena = cadena.concat(Integer.toString(i));
            cadena = cadena.concat(String.valueOf(i));
        }
        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i < 10; i++){
            System.out.println(sb);
            sb.append(i);
        }
    }
}
