package me.upp.agenda;

import java.util.ArrayList;
import java.util.Date;

public class Agendar {

    private String nota;
    private Date fecha;
    private Contacto contacto;
    private static ArrayList<Agendar> agendas = new ArrayList<Agendar>();

    public Agendar(String nota, Date fecha, Contacto contacto) {
        this.nota = nota;
        this.fecha = fecha;
        this.contacto = contacto;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    
}
