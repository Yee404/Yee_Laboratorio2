public class Salon {
    private int idSede;
    private char edificio;
    private int nivel;
    private int idSalon;
    private int capacidad;

    public Salon(int idSede, char edificio, int nivel, int idSalon, int capacidad) {
        this.idSede = idSede;
        this.edificio = edificio;
        this.nivel = nivel;
        this.idSalon = idSalon;
        this.capacidad = capacidad;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public char getEdificio() {
        return edificio;
    }

    public void setEdificio(char edificio) {
        this.edificio = edificio;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(int idSalon) {
        this.idSalon = idSalon;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
