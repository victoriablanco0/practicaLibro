package modelo;
public class Almacen {

private Libro[] libros;
private int paginasMinuto = 1;
private int librosAgregados = 0;
String lineaSeparacion = "|" + "-".repeat(43) + "|";
double valorTotal = 0;
double tiempoTotal = 0;

public Almacen(int tamano){
    libros = new Libro[tamano];

}
public void setLibros(Libro[] libros) {
    this.libros = libros;
}

public Libro[] getLibros() {
    return libros;
}


public void setPaginasMinuto(int paginasMinuto) {
    this.paginasMinuto = paginasMinuto;
}


/*//Comprobamos si hay espacio en el almacen
public boolean anadirLibro(Libro libro){
    if(librosAnadidos < libros.length){
        libros[librosAnadidos++] = libro;
    } else {
        System.out.println("No hay más espacio en el almacén");
        
    }
    return false;
}

//imprimimos la tabla


public void mostrarLibros(){
System.out.println(lineaSeparacion);
System.out.println("| Título               | Año Publicación | Autor               | Premio planeta | Páginas   | Precio         |");
System.out.println(lineaSeparacion);

for(int j=0; j<librosAnadidos; j++){
    Libro libro = libros[j];
    System.out.println(libro.toString());
    valorTotal += libro.getPrecio();
    tiempoTotal +=libro.getPaginas() / paginasMinuto;

}
*/
public boolean agregarLibro(Libro libro) {
    if (librosAgregados < libros.length) {
        libros[librosAgregados++] = libro;
        return true;
    } else {
        System.out.println("No hay espacio disponible en el almacén.");
        return false;
    }
}

public void mostrarLibros() {
    if (librosAgregados == 0) {
        System.out.println("No hay libros en el almacén.");
        return;
    }

    System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
    System.out.println("| Título               | Año Publicación | Autor               | Premio planeta | Páginas   | Precio         |");
    System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");

    double valorTotal = 0;
    int tiempoTotalLectura = 0;

    for (int i = 0; i < librosAgregados; i++) {
        Libro libro = libros[i];
        System.out.println(libro.toString());
        valorTotal += libro.getPrecio();
        tiempoTotalLectura += libro.getPaginas() / paginasMinuto;
    }


//imprimir el tiempo total de lectura y el valor total del almacén
System.out.println(lineaSeparacion);
System.out.println("| Tiempo de lectura total del almacén: " + tiempoTotal + " min");
System.out.println("| Valor total del almacén: " + valorTotal + "euros");
System.out.println(lineaSeparacion);


}

}




