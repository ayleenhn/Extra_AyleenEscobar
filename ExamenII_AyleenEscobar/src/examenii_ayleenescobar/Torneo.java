
package examenii_ayleenescobar;

import java.io.Serializable;
import java.util.List;

public class Torneo implements Serializable{
    private String nombre;
    private List<Equipos> equipos;
    private List<Partidos> partidos;

    public Torneo() {
    }

    public Torneo(String nombre, List<Equipos> equipos, List<Partidos> partidos) {
        this.nombre = nombre;
        this.equipos = equipos;
        this.partidos = partidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipos> equipos) {
        this.equipos = equipos;
    }

    public List<Partidos> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partidos> partidos) {
        this.partidos = partidos;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
