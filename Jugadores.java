public class Jugadores {
    private String nombre;
    private int puntajetotal;

    public Jugadores(String nombre) {
        this.nombre = nombre;
        puntajetotal = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntajeTotal() {
        return puntajetotal;
    }

    public void agregarPuntos(int points) {
        puntajetotal += points;
    }
}
// acá se mira todo lo necesario para que los jugadores puedan existir, se les da el nombre, se va sumando los puntos, etc. 

