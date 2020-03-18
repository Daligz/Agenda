package me.upp.agenda;

public class Agendar {
    private String nota;
    private date fecha;
    private Contacto contacto;

    public Agendar(String nota, date fecha, Contacto contacto) {
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

    public date getFecha() {
        return fecha;
    }

    public void setFecha(date fecha) {
        this.fecha = fecha;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    
}
