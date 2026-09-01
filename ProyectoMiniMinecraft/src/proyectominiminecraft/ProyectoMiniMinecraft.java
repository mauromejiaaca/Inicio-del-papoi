package proyectominiminecraft;
import java.util.Scanner;

public class ProyectoMiniMinecraft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Zombie zombie1 = new Zombie(5, 2, 10, 15, 20);
        Zombie zombie2 = new Zombie(5, 2, 5, 5, 10);
        IO.println("Zombies generados.");
        
        
        Enderman enderman1 = new Enderman(7, 3, 8, 7, 11);
        Enderman enderman2 = new Enderman(7, 3, 3, 1 ,0);
        IO.println("Endermans generados.");
        
        Jugador jugador1 = new Jugador("Jugador 1", 10, 5, 5, 5);
        Jugador jugador2 = new Jugador("Jugador 2", 10, 5, 15, 15);
        
        Espada espada1 = new Espada(1, 4, 0, 1); 
        Espada espada2 = new Espada(4, 1, 1, 1);
        
        IO.println("--- ESPADA MADERA ---");
        IO.println("X: " + espada1.x);
        IO.println("Y: " + espada1.y);
        IO.println("Z: " + espada1.z);
        IO.println("----------------------");
        
        IO.println("Mueve al Jugador 1");
        IO.println("X:");
        int mov_j1x = scan.nextInt();
        IO.println("Y:");
        int mov_j1y = scan.nextInt();
        IO.println("Z:");
        int mov_j1z = scan.nextInt();
        jugador1.x = mov_j1x;
        jugador1.y = mov_j1y;
        jugador1.z = mov_j1z;
        IO.println("Desplazando Jugador 1..");
        
        if (jugador1.x == espada1.x && jugador1.y == espada1.y && jugador1.z == espada1.z) {
            IO.println("Consiguiendo espada..");
            jugador1.conseguirEspada(espada1);
            IO.println("Espada almacenada!");
        } else {
            IO.println("No recogiste la espada..");
        } 
        
        IO.println("--- ESPADA DIAMANTE ---");
        IO.println("X: " + espada2.x);
        IO.println("Y: " + espada2.y);
        IO.println("Z: " + espada2.z);
        IO.println("----------------------");        
        
        IO.println("Mueve al jugador 2:");
        IO.println("X:");
        int mov_j2x = scan.nextInt();
        IO.println("Y:");
        int mov_j2y = scan.nextInt();
        IO.println("Z:");
        int mov_j2z = scan.nextInt();
        jugador2.x = mov_j2x;
        jugador2.y = mov_j2y;
        jugador2.z = mov_j2z;
        IO.println("Desplazando Jugador 2..");
        
        if (jugador2.x == espada2.x && jugador2.y == espada2.y && jugador2.z == espada2.z) {
            IO.println("Consiguiendo espada..");
            jugador2.conseguirEspada(espada2);
            IO.println("Espada almacenada!");
        } else {
            IO.println("No recogiste la espada..");
        }
        
        zombie1.mover(jugador1.x, jugador1.y, jugador1.z); 
        if (zombie1.x == jugador1.x && zombie1.y == jugador1.y && zombie1.z == jugador1.z) {
            zombie1.atacar(jugador1);
        } 
        
        zombie2.mover(jugador2.x, jugador2.y, jugador2.z);
        if (zombie2.x == jugador2.x && zombie2.y == jugador2.y && zombie2.z == jugador2.z) {
            zombie2.atacar(jugador2);
        }
        
        if (zombie1.x == jugador1.x && zombie1.y == jugador1.y && zombie1.z == jugador1.z) { 
            while (zombie1.vida > 0) {
                jugador1.atacar(zombie1);
            }
        }
        
        if (zombie2.x == jugador2.x && zombie2.y == jugador2.y && zombie2.z == jugador2.z) { 
            while (zombie2.vida > 0) {
                jugador2.atacar(zombie2);
            }
        }
        
        enderman1.teletransportarse(jugador1);
        enderman2.teletransportarse(jugador2);
        
        while (enderman1.vida > 0) {
            jugador1.atacar(enderman1);
        }
        
        while(enderman2.vida > 0) {
            jugador2.atacar(enderman2);
        }
        
        IO.println("---" + jugador1.nombre +  "---");
        IO.println("Vida: " + jugador1.vida);
        IO.println("X: " + jugador1.x);
        IO.println("Y: " + jugador1.y );
        IO.println("Z: " + jugador1.z);
        IO.println("-------------------------------");
        
        IO.println("---" + jugador2.nombre +  "---");
        IO.println("Vida: " + jugador2.vida);
        IO.println("X: " + jugador2.x);
        IO.println("Y: " + jugador2.y );
        IO.println("Z: " + jugador2.z);
        IO.println("-------------------------------");
    }
    
    
}