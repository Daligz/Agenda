package me.upp.agenda;

import java.util.ArrayList;

public class Contacto {

    private String telefono, nombre, correo;

    private static ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    private static ArrayList<String> contactosNombres = new ArrayList<String>();
    private static ArrayList<String> contactosData = new ArrayList<String>();

    public Contacto(String telefono, String nombre, String correo) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.correo = correo;
        contactos.add(this);
        contactosNombres.add(nombre);
        contactosData.add(serializeData(nombre, telefono, correo));
    }

    public static String getByName(String name) {
        if (name == null) return null;
        int i = 0;
        for (Contacto contacto : Contacto.getContactos()) {
            if (contacto.getNombre().equalsIgnoreCase(name)) return contactosData.get(i);
            i++;
        }
        return null;
    }

    private String serializeData(String nombre, String telefono, String correo) {
        return nombre + " | " + telefono + " | " + correo;
    }

    public static ArrayList<String> getContactosData() {
        return contactosData;
    }

    public static ArrayList<String> getContactosNombres() {
        return contactosNombres;
    }

    public static ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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
    public 
}
