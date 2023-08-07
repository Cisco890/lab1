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
        while (continuar.equalsIgnoreCase("si") &&  jugadoractual.getPuntajeTotal() <= 100) {
           
            int resultado1 = dado1.lazamiento();
            int resultado2 = dado2.lazamiento();
            
            if (resultado1 == 1 || resultado2 == 1) {
                total = 0;
                System.out.println("Primer dado: " + resultado1);
                System.out.println("Segundo dado: " + resultado2);
                System.out.println("Ha obtenido un valor de 1 en alguno de los dados, por lo que pierde sus puntos: " + total);
                break;
            }
            
            int suma = resultado1 + resultado2;
            total += suma;
            
            if (total >= 100) {
                System.out.println("Primer dado: " + resultado1);
                System.out.println("Segundo dado: " + resultado2);
                System.out.println("Puntos de ronda: " + suma);
                System.out.println("Ha ganado el juego con un total de " + total + " puntos");
                break;
            }
            
            System.out.println("Primer dado: " + resultado1);
            System.out.println("Segundo dado: " + resultado2);
            System.out.println("Puntos de ronda: " + suma);
            System.out.println("Puntos totales: " + total);
            System.out.println("Desea continuar tirando los dados? (si/no): ");
            continuar = myObj.nextLine();
            jugadoractual = (jugadoractual == Jugador1) ? Jugador2 : Jugador1;
        }
        
        myObj.close();
    }
}


