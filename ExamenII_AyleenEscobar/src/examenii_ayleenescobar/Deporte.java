
package examenii_ayleenescobar;

import java.io.Serializable;
import java.util.List;

public class Deporte implements Serializable{
    private String nombre;
    private List<Torneo> torneos;

    public Deporte() {
    }

    public Deporte(String nombre, List<Torneo> torneos) {
        this.nombre = nombre;
        this.torneos = torneos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(List<Torneo> torneos) {
        this.torneos = torneos;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
