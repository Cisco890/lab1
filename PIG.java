public class PIG {
    public static void main(String[] args) {
        Jugadores jugador1 = new Jugadores("Jugador 1");
        Jugadores jugador2 = new Jugadores("Jugador 2");
        Game juego = new Game(jugador1, jugador2);
        juego.start();
    }
}

    

