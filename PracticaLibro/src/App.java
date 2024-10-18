import javax.swing.text.html.StyleSheet;

import com.coti.tools.Esdia;

import modelo.Almacen;
import modelo.Libro;

public class App {
    public static void main(String[] args) throws Exception {
    int n;
do{
    mostrarMenu();
    n = Esdia.readInt("Introduzca la opcion deseada de 1 a 4:") ;
    Almacen almacen = new Almacen(1);
    Libro[]libros = almacen.getLibros();

        switch (n) {
        case 1:

            int tamano = Esdia.readInt("Introduzca el tamaño del almacén:");
            almacen = new Almacen(tamano);
            System.out.println("Se ha creado un nuevo almacen de tamaño " + tamano);
            break;

        case 2: 
          int paginasMinuto = Esdia.readInt("Introduzca ritmo de lectura en páginas por minuto: ");        
        
            break;    
        case 3:  
        int i =0; 
        if(i < libros.length){
            String titulo = Esdia.readString("Introduzca el título del libro : ");
            int anioPublicacion = Esdia.readInt("Introduzca el año de publicación: ");
            String autor = Esdia.readString("Introduzca el autor: ");
            int paginas = Esdia.readInt("Introduzca el numero de paginas: ");
            double precio = Esdia.readDouble("Introduzca el precio del libro: ");
            Libro libro = new Libro(titulo, anioPublicacion, autor, paginas, precio);
            libros[i] = libro;
            i++;
        }
            break;

        case 4:
            almacen.mostrarLibros();
            break;
        case 5:
        System.out.println("Salir del programa y eliminar información");
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