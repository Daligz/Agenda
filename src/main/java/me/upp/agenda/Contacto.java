package me.upp.agenda;

import java.util.ArrayList;

public class Contacto {

    private int telefono;
    private String nombre, correo;

    private static ArrayList<Contacto> contactos = new ArrayList<Contacto>();

    public Contacto(int telefono, String nombre, String correo) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.correo = correo;
        contactos.add(this);
    }

    public static Contacto getByName(String name) {
        if (name == null) return null;
        for (Contacto contacto : Contacto.getContactos()) {
            if (contacto.getNombre().equalsIgnoreCase(name)) return contacto;
        }
        return null;
    }

    public static ArrayList<Contacto> getContactos() {
        return contactos;
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
