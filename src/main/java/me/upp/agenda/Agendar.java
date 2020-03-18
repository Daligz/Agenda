package me.upp.agenda;

import java.util.Date;

public class Agendar {

    private String nota;
    private Date fecha;
    private Contacto contacto;

    public Agendar(String nota, Date fecha, Contacto contacto) {
        this.nota = nota;
        this.fecha = fecha;
        this.contacto = contacto;
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
