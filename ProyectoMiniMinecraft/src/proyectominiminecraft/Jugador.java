package proyectominiminecraft;
public class Jugador {
    String nombre;
    int vida;
    int x;
    int y;
    int z;
    Espada espada;

    public Jugador(String nombre, int vida, int x, int y, int z) {
        this.nombre = nombre;
        this.vida = vida;
        this.x = x;
        this.y = y;
        this.z = z;
        espada = null;
    }

    public void mover(int dx, int dy, int dz) {
        x = dx;
        y = dy;
        z = dz;
    }

    public void recibirDanio(int danio) {
        vida = vida - danio;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void conseguirEspada(Espada espada) {
        this.espada = espada;
    }

    public void atacar(Zombie zombie) {
        if (espada != null && espada.durabilidad > 0) {
            zombie.recibirDanio(espada.danio);
        }
    }

    public void atacar(Enderman enderman) {
        if (espada != null && espada.durabilidad > 0) {
            enderman.recibirDanio(espada.danio);
        }
    }
}
    