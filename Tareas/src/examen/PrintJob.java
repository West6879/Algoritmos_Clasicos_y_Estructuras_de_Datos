package examen;

import java.util.Date;

// Clase PrintJob que representa los trabajos de impresion.
// Representa los datos que se van a manejar en la cola.
public class PrintJob {
    private String nomUser;
    private Date date;
    private Prioridad prioridad;

    public PrintJob(String nomUser, Date date, Prioridad prioridad) {
        this.nomUser = nomUser;
        this.date = date;
        this.prioridad = prioridad;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

}
