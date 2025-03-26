import java.util.Scanner;

public class Arreglos {
    
    public static void leerCalificaciones(){

    }

    public static void evaluarCalificaciones(){

    }
    
    public static void main(String[] args) {
        double[] calificaciones = new double[5];
        Scanner sc= new Scanner(System.in);
        for (int i=0; i<calificaciones.length; i++){
            System.out.println("Escribe la calificacion [" + i + "]: "); 
            calificaciones[i] = sc.nextDouble();
        }
        //no se imprime el contenido de todas las casillas
        //solo se imprime la direccion de memoria en donde empiezza el arreglo
        //System.out.println("calificaciones: " + calificaciones );

        //impresion usando for extendido
        System.out.println("Contenido del arreglo de calificaciones:");
        for ( double calificacion : calificaciones)
        System.out.println(calificacion);

        System.out.println("Contenido de calificaciones:");
        //impresion con el for tradicional
        for ( int i=0; i<calificaciones.length; i++)
        System.out.println(calificaciones[i]);

        sc.close();
    }
}