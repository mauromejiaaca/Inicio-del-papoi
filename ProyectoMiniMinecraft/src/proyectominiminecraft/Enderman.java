package proyectominiminecraft;
public class Enderman {
    int vida;
    int fuerza;
    int x;
    int y;
    int z;

    public Enderman(int vida, int fuerza, int x, int y, int z) {
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

    public void teletransportarse(Jugador jugador) {
        x = jugador.x;
        y = jugador.y;
        z = jugador.z;
        atacar(jugador);
    }
}