package modelo;
public class Almacen {

private Libro[] libros;
private int paginasMinuto = 1;
private int librosAñadidos = 0;
String lineaSeparacion = "|" + "-".repeat(43) + "|";
double valorTotal = 0;
double tiempoTotal = 0;

public Almacen(int tamano){
    this.libros = new Libro[tamano];
}


public void setPaginasMinuto(int paginasMinuto) {
    this.paginasMinuto = paginasMinuto;
}
public Libro[] getLibros(){
    return libros;
}

public void setLibros(Libro[] libros) {
    this.libros = libros;
}


public void mostrarLibros(){
    if(librosAñadidos == 0){
        System.out.println("No hay libros añadidos");
    }

System.out.println(lineaSeparacion);
System.out.println("| Título               | Año Publicación | Autor               | Premio planeta | Páginas   | Precio         |");
System.out.println(lineaSeparacion);




}

}




