package proyectominiminecraft;
public class Espada {
    int tipo;
    String nombre;
    int danio;
    int durabilidad;
    int x;
    int y;
    int z;

    public Espada(int tipo, int x, int y, int z) {
        this.tipo = tipo;
        this.x = x;
        this.y = y;
        this.z = z;
        asignarCaracteristicas();
    }

    public void asignarCaracteristicas() {
        switch (tipo) {
            case 1:
                nombre = "Madera";
                danio = 1;
                durabilidad = 20;
                break;
            case 2:
                nombre = "Piedra";
                danio = 2;
                durabilidad = 30;
                break;
            case 3:
                nombre = "Hierro";
                danio = 3;
                durabilidad = 40;
                break;
            case 4:
                nombre = "Diamante";
                danio = 4;
                durabilidad = 80;
                break;
            default:
                nombre = "Desconocida";
                danio = 0;
                durabilidad = 0;
                break;
        }
    }
}
