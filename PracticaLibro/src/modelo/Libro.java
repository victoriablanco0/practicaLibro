package modelo;

import com.coti.tools.Esdia;

public class Libro {
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    private int paginas;
    private double precio;



//Método constructor de Libro
public Libro(String titulo, int anioPublicacion, Autor autor, int paginas,  double precio){
    this.titulo = titulo;
    this.anioPublicacion = anioPublicacion;
    this.autor = autor;
    this.paginas = paginas;
    this.precio = precio;
}


//añadimos getters y setters
public int getAnioPublicacion() {
    return anioPublicacion;
}
public int getPaginas() {
    return paginas;
}
public double getPrecio() {
    return precio;
}
public String getTitulo() {
    return titulo;
}
public void setAnioPublicacion(int anioPublicacion) {
    this.anioPublicacion = anioPublicacion;
}
public void setPaginas(int paginas) {
    this.paginas = paginas;
}
public void setPrecio(double precio) {
    this.precio = precio;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}


//preguntamos si el autor tiene premio planeta y mostramos la informacion
public String toString(){
    String premioPlaneta = autor.PremioPlaneta() ? "Si" : "No";
    return String.format("%-20s | %-15d | %-20s | %-15s | %-10d | %-15.2f €", titulo, anioPublicacion, autor.toString(), premioPlaneta, paginas, precio);
}
}