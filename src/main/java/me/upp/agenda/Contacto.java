package me.upp.agenda;

public class Contacto {

    private int telefono;
    private String nombre, correo;

    public Contacto(int telefono, String nombre, String correo) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
