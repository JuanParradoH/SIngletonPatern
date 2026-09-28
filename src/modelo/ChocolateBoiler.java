package modelo;

public class ChocolateBoiler {
    private boolean vacio;
    private boolean resistenciaEncendida;
    private static ChocolateBoiler instancia;

    private ChocolateBoiler() {
        vacio = true;
        resistenciaEncendida = false;
    }

    public static ChocolateBoiler getInstancia() {
        if (instancia == null) {
            instancia = new ChocolateBoiler();
        }
        return instancia;
    }

    public void llenar() {
        if (vacio && !resistenciaEncendida) {
            vacio = false;
            System.out.println("Llenando boiler con mezcla de chocolate y leche.");
        }
    }

    public void iniciarMezcla() {
        if (!vacio && !resistenciaEncendida) {
            resistenciaEncendida = true;
            System.out.println("Iniciando proceso de mezcla. Resistencia encendida.");
        }
    }

    public void vaciar() {
        if (!vacio && resistenciaEncendida) {
            vacio = true;
            resistenciaEncendida = false;
            System.out.println("Vaciando boiler. Resistencia apagada.");
        }
    }
}