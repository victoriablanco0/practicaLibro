import javax.swing.text.html.StyleSheet;

import com.coti.tools.Esdia;
import modelo.Almacen;
import modelo.Autor;
import modelo.Libro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int n;
    Almacen almacen;
do{
    mostrarMenu();
    n = Esdia.readInt("Introduzca la opcion deseada de 1 a 4:") ;
       almacen = new Almacen(1);

        switch (n) {
        case 1:
        //se pide el tamaño del almacen
            int tamano = Esdia.readInt("Introduzca el tamaño del almacén:");
            almacen = new Almacen(tamano);
            System.out.println("Se ha creado un nuevo almacen de tamaño " + tamano);
            break;

        case 2: 
        //se pide el ritmo de lectura
             int paginasMinuto = Esdia.readInt("Introduzca ritmo de lectura en páginas por minuto: ");        
            System.out.println("El tiempo de lectura son " + paginasMinuto + " paginas por minuto" );
            break;    
        case 3:
        //Se añade un nuevo libro al almacen
        Scanner scanner = new Scanner(System.in);
        String titulo = Esdia.readString("Introduzca el título del libro : ");
        int anioPublicacion = Esdia.readInt("Introduzca el año de publicación: ");
        String nombre = Esdia.readString("Introduzca el nombre del autor: ");
        String apellidos = Esdia.readString("Introduzca los apellidos del autor:");
        System.out.print("Si el autor ha ganado el Premio Planeta introduce true y en otro caso false ");
            boolean premioPlaneta = scanner.nextBoolean();
        int paginas = Esdia.readInt("Introduzca el numero de paginas: ");
        double precio = Esdia.readDouble("Introduzca el precio del libro: ");
        
        Autor autor = new Autor(nombre, apellidos, premioPlaneta);
        Libro[] libros = almacen.getLibros();
        Libro libro = new Libro(titulo, anioPublicacion, autor, paginas, precio);
        for (int index = 0; index < 1; index++) {
    
            libros[index] = libro;        }
        if (almacen.agregarLibro(libro)){
            System.out.println("Libro añadido correctamente");
        }
        scanner.nextLine(); //limpiar el buffer             break;

        case 4:
            almacen.mostrarLibros();
            break;
        case 5:
            System.out.println("Salir del programa y eliminar información");
        default: 
        System.out.println("Opción no correcta");
    } 


    }while((n>=1)&&(n<=4));
}

private static void mostrarMenu(){
    String lineaSeparacion = "|" + "-".repeat(43) + "|";
    System.out.println(lineaSeparacion);
    System.out.println("| MIS LIBROS" + " ".repeat(32) + "|");
    System.out.println(lineaSeparacion);
    System.out.println("1) Nuevo almacén de libros");
    System.out.println("2) Establecer ritmo de lectura (páginas por minuto)");
    System.out.println("3) Añadir un nuevo libro al almacén");
    System.out.println("4) Mostrar información actual de libros");
    System.out.println("5) Salir (se borrará toda la información)");
    System.out.println(lineaSeparacion);
}

}
