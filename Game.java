import java.util.Scanner;

public class Game {
    private Jugadores Jugador1;
    private Jugadores Jugador2;
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();
    private int total = 0;
    
    public Game(Jugadores jugador1, Jugadores jugador2) {
        Jugador1 = jugador1;
        Jugador2 = jugador2;
    }
    
    public void start() {
        Scanner myObj = new Scanner(System.in);
        String continuar;
        
        System.out.println("Desea jugar (si/no): ");
        continuar = myObj.nextLine();
        
        Jugadores jugadoractual = Jugador1;
        
        while (continuar.equalsIgnoreCase("si") && (Jugador1.getPuntajeTotal() < 100 && Jugador2.getPuntajeTotal() < 100)) {
            if (jugadoractual == Jugador1) {
                System.out.println("Turno de " + Jugador1.getNombre());
            } 
            if (jugadoractual == Jugador2) {
                System.out.println("Turno de " + Jugador2.getNombre());
            }
            
            int resultado1 = dado1.lazamiento();
            int resultado2 = dado2.lazamiento();
            
            if (resultado1 == 1 || resultado2 == 1) {
                total = 0;
                System.out.println("Primer dado: " + resultado1);
                System.out.println("Segundo dado: " + resultado2);
                System.out.println("Ha obtenido un valor de 1 en alguno de los dados, por lo que pierde sus puntos en esta ronda.");
                jugadoractual = (jugadoractual == Jugador1) ? Jugador2 : Jugador1;
            } else {
                int suma = resultado1 + resultado2;
                total += suma;
                System.out.println("Primer dado: " + resultado1);
                System.out.println("Segundo dado: " + resultado2);
                System.out.println("Puntos de ronda: " + suma);
                System.out.println("Puntos totales: " + total);
            }

            System.out.println("Desea continuar tirando los dados? (si/no): ");
            continuar = myObj.nextLine();
            if (!continuar.equalsIgnoreCase("si")) {
                jugadoractual.agregarPuntos(total);
                total = 0;
                jugadoractual = (jugadoractual == Jugador1) ? Jugador2 : Jugador1;
            }
        }

        myObj.close();

        if (Jugador1.getPuntajeTotal() >= 100) {
            System.out.println("EL JUGADOR 1 HA GANADO CON UN TOTAL DE " + Jugador1.getPuntajeTotal() + " PUNTOS!!!!!");
        }
        if (Jugador2.getPuntajeTotal() >= 100) {
            System.out.println("EL JUGADOR 2 HA GANADO CON UN TOTAL DE " + Jugador2.getPuntajeTotal() + " PUNTOS!!!!!");
        }
    }
}
// Game() es la lógica detras del juego, se importan los dados y los jugadores, se delimitan los parámetros que se requieren para el juego funcional. 

