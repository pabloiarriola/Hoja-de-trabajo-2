import java.util.*;

/**
 * Universidad del Valle de Guatemala
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Algoritmos y Estructuras de Datos
 * Seccion 10
 * @author Pablo Arriola
 * @author Christopher Aju
 */
/**
 * Clase principal del programa
 */
public class PostFixMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Operar principal = new Operar() ;
        Scanner scan = new Scanner(System.in);
        String cadena = "";
        int prompt=0;
        boolean lineas=true;

        System.out.println ("-----------------------------------------------------");
        System.out.println ("Hoja de trabajo # 2");
        System.out.println ("Operador de funciones aritmeticas postfix");
        System.out.println ("Para salir escriba QUIT");
        System.out.println ("-----------------------------------------------------");
        System.out.println ("");

        while(lineas){
            prompt++;
            System.out.print("["+prompt+"]>");
            cadena = scan.nextLine();
            cadena=cadena.toLowerCase();

            if("quit".equals(cadena)) break;

            System.out.println(principal.hacerOperacion(cadena));
            principal.reset();
        }

    }

}
