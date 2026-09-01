package proyectominiminecraft;
public class Zombie {
    int vida;
    int fuerza;
    int x;
    int y;
    int z;

    public Zombie(int vida, int fuerza, int x, int y, int z) {
        this.vida = vida;
        this.fuerza = fuerza;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void atacar(Jugador jugador) {
        jugador.vida = jugador.vida - fuerza;
        if (jugador.vida < 0) {
            jugador.vida = 0; 
        }
    }

    public void recibirDanio(int danio) {
        vida = vida - danio;
        if (vida < 0) {
            vida = 0;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void mover(int dx, int dy, int dz) {
        x = dx;
        y = dy;
        z = dz;
    }
}
    