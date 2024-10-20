package modelo;

public class Autor {
private String nombre;
private String apellidos;
private boolean premioPlaneta;



//Método constructor del autor
public Autor(String nombre, String apellidos, boolean premioPlaneta){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.premioPlaneta = premioPlaneta;
}




//getters y setters
public String getApellidos() {
    return apellidos;
}
public String getNombre() {
    return nombre;
}
public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String toString(){
    return nombre + " " + apellidos;
}


public boolean PremioPlaneta(){
    return premioPlaneta;
}

}
