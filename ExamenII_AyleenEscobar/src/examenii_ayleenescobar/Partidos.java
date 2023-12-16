package examenii_ayleenescobar;

public class Partidos {
    private String equipo1;
    private String equipo2;
    private int puntosEquipo1;
    private int puntosEquipo2;

    public Partidos() {
    }

    public Partidos(String equipo1, String equipo2, int puntosEquipo1, int puntosEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.puntosEquipo1 = puntosEquipo1;
        this.puntosEquipo2 = puntosEquipo2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getPuntosEquipo1() {
        return puntosEquipo1;
    }

    public void setPuntosEquipo1(int puntosEquipo1) {
        this.puntosEquipo1 = puntosEquipo1;
    }

    public int getPuntosEquipo2() {
        return puntosEquipo2;
    }

    public void setPuntosEquipo2(int puntosEquipo2) {
        this.puntosEquipo2 = puntosEquipo2;
    }
    
    
}
