package me.upp.agenda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Agendar {

    private String nota;
    private LocalDate fecha;
    private Contacto contacto;
    private static ArrayList<Agendar> agendas = new ArrayList<Agendar>();

    public Agendar(String nota, LocalDate fecha, Contacto contacto) {
        this.nota = nota;
        this.fecha = fecha;
        this.contacto = contacto;
        agendas.add(this);
    }

    public Agendar(String nota, LocalDate fecha) {
        this.nota = nota;
        this.fecha = fecha;
        this.contacto = null;
        agendas.add(this);
    }

    public static ArrayList<Agendar> getAgendas() {
        return agendas;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    
}
