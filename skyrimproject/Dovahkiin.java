
package skyrimproject;


public class Dovahkiin extends Personaje implements Atacante, GritoDragon {
    private Arma armaEquipada;

    public Dovahkiin(String nombre, int vida, int nivel, int magia, int fuerza, Arma armaEquipada) {
        super(nombre, vida, nivel, magia, fuerza);
        this.armaEquipada = armaEquipada;
    }

    public Arma getArmaEquipada() {
        return armaEquipada;
    }

    public void setArmaEquipada(Arma armaEquipada) {
        this.armaEquipada = armaEquipada;
    }

    @Override
    public void atacar() {
        int danoTotal = armaEquipada.getDano() + getFuerza();
        System.out.println(getNombre() + " ataca con " + armaEquipada.getNombre() + " causando " + danoTotal + " de dano fisico");
    }

    @Override
    public void usarThuum() {
        int costoMagia = 20;
        if (getMagia() >= costoMagia) {
            setMagia(getMagia() - costoMagia);
            System.out.println("FUS RO DAH (Magia restante: " + getMagia() + ")");
        } else {
            System.out.println("No hay suficiente magia para gritar");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Heroe: " + getNombre() + " | Nivel: " + getNivel() + " | Vida: " + getVida());
        System.out.println("| Magia: " + getMagia() + "| Fuerza: " + getFuerza());
    }
}
