package modelo;

import com.coti.tools.Esdia;

public class Libro {
    private String titulo;
    private int anioPublicacion;
    private String autor;
    private int paginas;
    private double precio;



//Método constructor de Libro
public Libro(String titulo, int anioPublicacion, String autor, int paginas,  double precio){
    this.titulo = titulo;
    this.anioPublicacion = anioPublicacion;
    this.autor = autor;
    this.paginas = paginas;
    this.precio = precio;
}

//Premio Planeta






//añadimos getters y setters
public int getAnioPublicacion() {
    return anioPublicacion;
}
public String getAutor() {
    return autor;
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
public void setAutor(String autor) {
    this.autor = autor;
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
}